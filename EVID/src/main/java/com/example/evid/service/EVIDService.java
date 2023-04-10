package com.example.evid.service;

import com.example.evid.feignclient.AddressClient;
import com.example.evid.model.Address;
import com.example.evid.model.AddressResponse;
import com.example.evid.model.EVID;
import com.example.evid.model.EVIDResponse;
import com.example.evid.repo.EVIDrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EVIDService {

    @Autowired
    private EVIDrepo repository;

    @Autowired
    private AddressClient addressClient;
    @Autowired
    private RestTemplate restTemplate;
    public List<EVID> getElectorsList() {
        return repository.findAll();
    }


    public EVIDResponse getVoterById(String id)
    {
        EVID evid =  repository.findById(id).get();
//        Address address = restTemplate.getForObject("http://localhost:9090/addres/{id}",Address.class,id);
        Address address = addressClient.getAddressByVoterId(id);

        EVIDResponse evidResponse = new EVIDResponse();
        evidResponse.setAddress(address);
        evidResponse.setElectorId(evid.getElectorId());
        evidResponse.setAge(evid.getAge());
        evidResponse.setElectorsName(evid.getElectorsName());
        evidResponse.setFatherName(evid.getFatherName());
        evidResponse.setSex(evid.getSex());
        return  evidResponse;
    }
    public EVID addVoter(EVID evid) {
        return  repository.save(evid);
    }

    public ResponseEntity<List<AddressResponse>> getAddressList()
    {
        List<AddressResponse> list = addressClient.getAddressList().getBody();
        System.out.println(list);
        return  new ResponseEntity<>(list, HttpStatus.OK);
    }
    public List<AddressResponse> getAddressList1()
    {
        List<AddressResponse> list = addressClient.getAddressList1();
        System.out.println(list);
        return  list;
    }
}




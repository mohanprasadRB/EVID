package com.example.eidvdata.service;

import com.example.eidvdata.model.Address;
import com.example.eidvdata.model.EVID;
import com.example.eidvdata.model.EVIDResponse;
import com.example.eidvdata.repo.EVIDrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EVIDService {

    @Autowired
    private EVIDrepo repository;

    @Autowired
    private RestTemplate restTemplate;
    public List<EVID> getElectorsList() {
        return repository.findAll();
    }


    public  EVIDResponse getVoterById(String id)
    {
        EVID evid =  repository.findById(id).get();
        Address address = restTemplate.getForObject("http://localhost:9090/addres/{id}",Address.class,id);
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
}

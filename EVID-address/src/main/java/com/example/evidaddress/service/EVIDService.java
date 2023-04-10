package com.example.evidaddress.service;

import com.example.evidaddress.AddresRepo.EVIDrepo;
import com.example.evidaddress.model.Address;
import com.example.evidaddress.model.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EVIDService {

    @Autowired
    private EVIDrepo eviDrepo;

    @Autowired
    private ModelMapper modelMapper;

    public AddressResponse getAddressById(String id) {
        Address address = eviDrepo.findById(id).get();
        AddressResponse addressResponse = new AddressResponse();
//        addressResponse.setEVID(address.getEVID());
//        addressResponse.setDistrict(address.getDistrict());
//        addressResponse.setTaluk(address.getTaluk());
//        addressResponse.setTown(address.getTown());
//        addressResponse.setGramaPanchyat(address.getGramaPanchyat());
//        addressResponse.setVillage(address.getVillage());
        addressResponse = modelMapper.map(address, AddressResponse.class);
        return addressResponse;
    }

    public List<AddressResponse> getAddressList() {

        List<Address> addressResponseList = eviDrepo.findAll();
//        List<AddressResponse> rlist = new ArrayList<>();
        List<AddressResponse> rlist = addressResponseList.stream().map(e -> modelMapper.map(e, AddressResponse.class)).collect(Collectors.toList());
        return rlist;
//        rlist = addressResponseList.stream()
//                .map(element -> modelMapper.map(element, AddressResponse.class))
//                .collect(Collectors.toList());

    }

    public List<AddressResponse> getAddressList1() {

        List<Address> addressResponseList = eviDrepo.findAll();
//        List<AddressResponse> rlist = new ArrayList<>();
        List<AddressResponse> rlist = addressResponseList.stream().map(e -> modelMapper.map(e, AddressResponse.class)).collect(Collectors.toList());
        return rlist;
    }
}

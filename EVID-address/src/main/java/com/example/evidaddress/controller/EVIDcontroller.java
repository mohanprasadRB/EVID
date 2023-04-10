package com.example.evidaddress.controller;

import com.example.evidaddress.model.Address;
import com.example.evidaddress.model.AddressResponse;
import com.example.evidaddress.service.EVIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EVIDcontroller {

    @Autowired
   private  EVIDService evidService;
    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse> getAddressById(@PathVariable("id") String id)
    {
        AddressResponse addressResponse = evidService.getAddressById(id);
        return  ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }

    @GetMapping("/address")
    public ResponseEntity<List<AddressResponse>> getAddressList()
    {
        List<AddressResponse> addressResponseList = evidService.getAddressList();
        return  ResponseEntity.status(HttpStatus.OK).body(addressResponseList);
    }

    @GetMapping("/address1")
    public  List<AddressResponse> getAddressList1()
    {
        List<AddressResponse> addressResponseList = evidService.getAddressList();
        return   addressResponseList;
    }
}

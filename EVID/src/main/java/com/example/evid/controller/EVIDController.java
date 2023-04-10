package com.example.evid.controller;

import com.example.evid.model.Address;
import com.example.evid.model.AddressResponse;
import com.example.evid.model.EVID;
import com.example.evid.model.EVIDResponse;
import com.example.evid.service.EVIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EVIDController {

    @Autowired
    private EVIDService evidService;

    @GetMapping("/vlist")
    public List<EVID> getElectorsList() {
        return evidService.getElectorsList();
    }

    @PostMapping("/vlist")
    public ResponseEntity<EVID> addVoter(@RequestBody EVID evid) {
        evidService.addVoter(evid);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/vlist/{id}")
    public EVIDResponse getVoterByID(@PathVariable("id") String id) {
        return evidService.getVoterById(id);
    }

    @GetMapping("/address1")
    public ResponseEntity<List<AddressResponse>> getAddressList() {
       List<AddressResponse> list =  evidService.getAddressList().getBody();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/address")
    public List<AddressResponse> getAddressList1() {
        return evidService.getAddressList1();

    }
}

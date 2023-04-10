package com.example.eidvdata.controller;

import com.example.eidvdata.model.EVID;
import com.example.eidvdata.model.EVIDResponse;
import com.example.eidvdata.service.EVIDService;
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
    public List<EVID> getElectorsList()
    {
       return evidService.getElectorsList();
    }

    @PostMapping("/vlist")
    public ResponseEntity<EVID> addVoter(@RequestBody EVID evid)
    {
        evidService.addVoter(evid);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/vlist/{id}")
    public EVIDResponse getVoterByID(@PathVariable("id") String id)
    {
        return evidService.getVoterById(id);
    }
}

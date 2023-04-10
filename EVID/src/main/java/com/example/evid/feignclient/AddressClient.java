package com.example.evid.feignclient;

import com.example.evid.model.Address;
import com.example.evid.model.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "abc", url = "http://localhost:9090/address")
public interface AddressClient {
    @GetMapping("/{id}")
    Address getAddressByVoterId(@PathVariable("id") String id);

    @GetMapping()
    public ResponseEntity<List<AddressResponse>> getAddressList();

    @GetMapping()
    public List<AddressResponse> getAddressList1();
}

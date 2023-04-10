package com.example.evidaddress.AddresRepo;

import com.example.evidaddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EVIDrepo extends JpaRepository<Address, String> {
}

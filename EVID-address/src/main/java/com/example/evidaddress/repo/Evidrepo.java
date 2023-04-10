package com.example.evidaddress.repo;

import com.example.evidaddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Evidrepo extends JpaRepository<Address,String> {
}

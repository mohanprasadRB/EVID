package com.example.evid.repo;

import com.example.evid.model.EVID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EVIDrepo extends JpaRepository<EVID, String> {

    void findByElectorId(int id);
}

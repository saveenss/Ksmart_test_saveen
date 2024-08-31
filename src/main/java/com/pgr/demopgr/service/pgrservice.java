package com.pgr.demopgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgr.demopgr.model.pgr;
import com.pgr.demopgr.repository.pgrRepository;
@Service
public class pgrservice {
     @Autowired
    private pgrRepository pgrRepository;
 
    public pgr saveCitizen(pgr pg) {
        return pgrRepository.save(pg);
    }
}

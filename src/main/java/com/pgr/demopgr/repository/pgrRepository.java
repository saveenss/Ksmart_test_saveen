package com.pgr.demopgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgr.demopgr.model.pgr;

@Repository
public interface pgrRepository extends JpaRepository<pgr, Integer> {
}
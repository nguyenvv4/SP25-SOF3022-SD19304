package com.example.sd19304.repository;

import com.example.sd19304.model.Ctsp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtspRepo extends JpaRepository<Ctsp, Integer> {
}

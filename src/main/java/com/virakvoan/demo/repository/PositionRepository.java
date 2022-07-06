package com.virakvoan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virakvoan.demo.model.position;

@Repository
public interface PositionRepository extends JpaRepository <position, Long> {

}

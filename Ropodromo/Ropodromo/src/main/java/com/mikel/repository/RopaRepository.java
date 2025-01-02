package com.mikel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mikel.model.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer> {

}



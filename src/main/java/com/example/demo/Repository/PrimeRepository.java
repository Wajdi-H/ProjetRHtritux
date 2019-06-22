package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Prime;

public interface PrimeRepository extends JpaRepository<Prime, Long>{

}

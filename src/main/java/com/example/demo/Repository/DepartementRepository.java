package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Departements;

public interface DepartementRepository extends JpaRepository<Departements, Long> {

}

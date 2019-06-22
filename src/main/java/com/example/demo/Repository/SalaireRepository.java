package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Salaires;

public interface SalaireRepository extends JpaRepository<Salaires, Long> {

}

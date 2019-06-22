package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Personnels;

public interface PersonnelsRepository extends JpaRepository<Personnels, Long> {
	 Personnels findByLogin(String login);


}

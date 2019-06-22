package com.example.demo.Rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.CongeRepository;
import com.example.demo.Repository.DepartementRepository;
import com.example.demo.Repository.PersonnelsRepository;
import com.example.demo.entity.Conges;
import com.example.demo.entity.Departements;
import com.example.demo.entity.Personnels;
@RestController
@RequestMapping("/conges")
@CrossOrigin("*")

public class CongesRest {
	@Autowired
	private PersonnelsRepository personnelsRepository;
	@Autowired
	private CongeRepository congeRepository;
	
	@PostMapping("add/{iddept}/{id}") 
	
	public void save(@RequestBody Conges conges)
	{
		Personnels d = new Personnels();
	d = personnelsRepository.findById(conges.getIdConge()).get();
	conges.setPersonnel(d);
	congeRepository.save(conges);
	}
	
 	@GetMapping("/{id}")
	public Conges findById(@PathVariable Long id)
	{
		return congeRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		congeRepository.deleteById(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody Conges conges)
	
	{
		conges.setIdConge(id);
		congeRepository.save(conges);
		
	}

}

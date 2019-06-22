package com.example.demo.Rest;

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

import com.example.demo.Repository.DepartementRepository;
import com.example.demo.Repository.SousDepartemetsRepository;
import com.example.demo.entity.Departements;
import com.example.demo.entity.SousDepartements;
@RestController
@RequestMapping("/sousdepartements")
@CrossOrigin("*")

public class SousDepartementsRest {
	@Autowired
	private SousDepartemetsRepository sousDepartemetsRepository;
	@Autowired
	private DepartementRepository departementRepository;
	
	@PostMapping("add/{iddept}/{id}")
	public void save(@RequestBody SousDepartements sousDepartements, @PathVariable Long id)
	{	Departements d = new Departements();
	d = departementRepository.findById(id).get();
	sousDepartements.setSsdepartements(d);

	sousDepartemetsRepository.save(sousDepartements);
	}
	@GetMapping("/{id}")
	public SousDepartements findById(@PathVariable Long id)
	{
		return sousDepartemetsRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		sousDepartemetsRepository.deleteById(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody SousDepartements sousDepartements)
	
	{
		sousDepartements.setIdSouDept(id);
		sousDepartemetsRepository.save(sousDepartements);
		
	}

}

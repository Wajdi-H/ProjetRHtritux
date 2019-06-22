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
import com.example.demo.Repository.PersonnelsRepository;
import com.example.demo.entity.Departements;
import com.example.demo.entity.Personnels;

@RestController
@RequestMapping("/personnels")
@CrossOrigin("*")
public class PersonnelsRest {
	@Autowired
	private PersonnelsRepository personnelsRepository;
	@Autowired
	private DepartementRepository departementRepository;
	
	@PostMapping("add/{iddept}/{id}") 
	
	public void save(@RequestBody Personnels personnel)
	{
	Departements d = new Departements();
	d = departementRepository.findById(personnel.getIdPers()).get();
	personnel.setDepartements(d);
		personnelsRepository.save(personnel);
	}
	
 	@GetMapping("/{id}")
	public Personnels findById(@PathVariable Long id)
	{
		return personnelsRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
	personnelsRepository.deleteById(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody Personnels personnel)
	
	{
		personnel.setIdPers(id);
		personnelsRepository.save(personnel);
		
	}
}

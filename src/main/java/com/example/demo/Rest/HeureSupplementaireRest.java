package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Repository.HeureSupplementaireRepository;
import com.example.demo.Repository.SalaireRepository;
import com.example.demo.entity.HeureSupplementaire;
import com.example.demo.entity.Salaires;

public class HeureSupplementaireRest {
	@Autowired
	private HeureSupplementaireRepository heureSupplementaireRepository;
	@Autowired
	private SalaireRepository salaireRepository ;
	
	@PostMapping("add/{idsal}/{id}") 
	
	public void save(@RequestBody HeureSupplementaire heureSupplementaire, @PathVariable Long id)
	{
	Salaires sh = new Salaires();
	sh = salaireRepository.findById(id).get();
	heureSupplementaire.setSalaire(sh);
	heureSupplementaireRepository.save(heureSupplementaire);
	}
	
 	@GetMapping("/{id}")
	public HeureSupplementaire findById(@PathVariable Long id)
	{
		return heureSupplementaireRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		heureSupplementaireRepository.deleteById(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody HeureSupplementaire heureSupplementaire)
	
	{
		heureSupplementaire.setIdHeure(id);
		heureSupplementaireRepository.save(heureSupplementaire);
		
	}



}

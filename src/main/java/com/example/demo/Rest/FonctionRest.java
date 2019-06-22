package com.example.demo.Rest;

import java.util.Collection;

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

import com.example.demo.Repository.FonctionRepository;
import com.example.demo.Repository.PersonnelsRepository;
import com.example.demo.entity.Fonctions;
import com.example.demo.entity.Personnels;


@RestController
@RequestMapping("/fonctions")
@CrossOrigin("*")
public class FonctionRest {
	@Autowired
	private FonctionRepository fonctionRepository;
	@Autowired
	private PersonnelsRepository personnelsRepository;

	  @PostMapping("add/{id}/{id}") public void save(@RequestBody Fonctions
	  fonction) { 
		 Personnels p = new Personnels(); 
		 p =personnelsRepository.findById(fonction.getIdFonction()).get(); 
		 fonction.setPersonnels(p);
	  fonctionRepository.save(fonction); }
	 
	
	 @GetMapping("/{id}")
	 public Fonctions findById(@PathVariable Long id)
		{
			return fonctionRepository.findById(id).get();
		}
	 @DeleteMapping("/deletet/{id}")
		public void supprimer(@PathVariable Long id) {
		
			fonctionRepository.deleteById(id);
		}
	 @PutMapping("edit/{id}")  // modification

		public void update(@PathVariable Long id , @RequestBody Fonctions fonction)
		
		{
		   fonction.setIdFonction(id);
			fonctionRepository.save(fonction);
			
		}

}
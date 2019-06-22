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

import com.example.demo.Repository.PrimeRepository;
import com.example.demo.Repository.SalaireRepository;
import com.example.demo.entity.Prime;
import com.example.demo.entity.Salaires;
@RestController
@RequestMapping("/salaires")
@CrossOrigin("*")

public class PrimeRest {
	@Autowired
	private PrimeRepository primeRepository;
	@Autowired
	private SalaireRepository salaireRepository ;
	
	@PostMapping("add/{idsal}/{id}") 
	
	public void save(@RequestBody Prime prime, @PathVariable Long id)
	{
	Salaires s = new Salaires();
	s = salaireRepository.findById(id).get();
	prime.setSalaire(s);
	primeRepository.save(prime);
	}
	
 	@GetMapping("/{id}")
	public Prime findById(@PathVariable Long id)
	{
		return primeRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		primeRepository.deleteById(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody Prime prime)
	
	{
		prime.setIdPrim(id);
		primeRepository.save(prime);
		
	}

}

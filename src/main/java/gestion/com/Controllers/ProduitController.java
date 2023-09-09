package gestion.com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gestion.com.Entities.Produit;

import gestion.com.Repositories.ProduitRepository;

@RestController
@RequestMapping("/Produits")
public class ProduitController {
	@Autowired
	ProduitRepository produitRepository;
	
	@PostMapping("/add")
	public Produit addProduit(@RequestBody Produit newProduit) {
		return produitRepository.save(newProduit);
	}
	@GetMapping
	public List<gestion.com.Entities.Produit> listProduits(){
		return produitRepository.findAll();
	}
	@PutMapping("/update")
	public Produit updateProduit(@RequestBody Produit newqProduit, @RequestParam(name="id") Long id) {
		if(produitRepository.findById(id)!=null) {
			newqProduit.setId(id);
			return produitRepository.save(newqProduit);
		}
		return null;
	}
	@DeleteMapping("/delete")
	public void deleteProduit(@RequestParam(name="id") Long id) {
		produitRepository.deleteById(id);
	}
	@GetMapping("/count")
	public ResponseEntity<?> countContacts(){
		return new ResponseEntity<String>("Le nombre des produits stocké dans la base de données est : "+ produitRepository.count(), HttpStatus.OK);
	}
	
	
}

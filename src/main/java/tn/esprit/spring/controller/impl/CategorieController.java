package tn.esprit.spring.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.ICategorieController;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.service.interfaces.ICategorieService;

@RestController
@RequestMapping("/categorie")
@CrossOrigin(origins="http://localhost:4200")
public class CategorieController implements ICategorieController{

	@Autowired
	ICategorieService categorieService;
	
	@Override
	@GetMapping("/list")
	@ResponseBody
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return categorieService.getAllCategories();
	}

	@Override
	@PostMapping("/add/")
	public ResponseEntity<Void> addCategorie(@RequestBody Categorie categorie) {
		// TODO Auto-generated method stub
		Long id = categorieService.addCategorie(categorie);
		if(id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);	}

	@Override
	@DeleteMapping("/delete/{categorieId}")
	public ResponseEntity<Void> deleteCategorieById(@PathVariable("categorieId") Long id) {
		// TODO Auto-generated method stub
		categorieService.deleteCategorieById(id);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@PutMapping("/edit/{categorieId}")
	public ResponseEntity<Void> updateCategorie(@RequestBody Categorie categorie, @PathVariable("categorieId") Long id) {
		// TODO Auto-generated method stub
		categorieService.updateCategorie(categorie, id);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@GetMapping("details/{categorieId}")
	public ResponseEntity<Categorie> getCategorie(@PathVariable("categorieId") Long id) {
		// TODO Auto-generated method stub
		Categorie categorie = categorieService.getCategorie(id);
		if (categorie == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(categorie, HttpStatus.OK);
	}

}

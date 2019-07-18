package tn.esprit.spring.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.ICategorieController;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.service.interfaces.ICategorieService;

@RestController
@RequestMapping("/")
public class CategorieController implements ICategorieController{

	@Autowired
	ICategorieService categorieService;
	
	@Override
	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return categorieService.getAllCategories();
	}

	@Override
	@RequestMapping(value = "/addcategorie/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addCategorie(@RequestBody Categorie categorie) {
		// TODO Auto-generated method stub
		Long id = categorieService.addCategorie(categorie);
		if(id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);	}

	@Override
	@RequestMapping(value = "/categorie/{categorieId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCategorieById(@PathVariable("categorieId") Long id) {
		// TODO Auto-generated method stub
		categorieService.deleteCategorieById(id);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@RequestMapping(value = "/categorie/{categorieId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateCategorie(@RequestBody Categorie categorie, @PathVariable("categorieId") Long id) {
		// TODO Auto-generated method stub
		categorieService.updateCategorie(categorie, id);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@RequestMapping(value = "/categorie/{categorieId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Categorie> getCategorie(@PathVariable("categorieId") Long id) {
		// TODO Auto-generated method stub
		Categorie categorie = categorieService.getCategorie(id);
		if (categorie == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(categorie, HttpStatus.OK);
	}

}

package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Categorie;

public interface ICategorieController {
	
	List<Categorie> getAllCategories();

	ResponseEntity<Void> addCategorie(Categorie categorie);

	ResponseEntity<Void> deleteCategorieById(Long id);

	ResponseEntity<Void> updateCategorie(Categorie categorie, Long id);

	ResponseEntity<Categorie> getCategorie(Long id);
}

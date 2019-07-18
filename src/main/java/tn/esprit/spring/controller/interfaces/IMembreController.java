package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Membre;

public interface IMembreController {

	List<Membre> getAllMembres();

	ResponseEntity<Void> addMembre(Membre membre);

	ResponseEntity<Void> deleteMembreById(Long id);

	ResponseEntity<Void> updateMembre(Membre membre, Long id);

	ResponseEntity<Membre> getMembre(Long id);	
}

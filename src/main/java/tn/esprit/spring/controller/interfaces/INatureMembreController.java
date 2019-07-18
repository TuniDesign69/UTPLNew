package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.NatureMembre;

public interface INatureMembreController {

	List<NatureMembre> getAllNatureMembres();

	ResponseEntity<Void> addNatureMembre(NatureMembre nature);

	ResponseEntity<Void> deleteNatureMembreById(Long id);

	ResponseEntity<Void> updateNatureMembre(NatureMembre nature, Long id);

	ResponseEntity<NatureMembre> getNatureMembre(Long id);
}

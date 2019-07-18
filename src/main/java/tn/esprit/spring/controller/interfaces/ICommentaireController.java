package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Commentaire;

public interface ICommentaireController {

	List<Commentaire> getAllCommentaires();

	ResponseEntity<Void> addCommentaire(Commentaire commentaire);

	ResponseEntity<Void> deleteCommentaireById(Long id);

	ResponseEntity<Void> updateCommentaire(Commentaire commentaire, Long id);

	ResponseEntity<Commentaire> getCommentaire(Long id);
}

package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Commentaire;

public interface ICommentaireController {

	List<Commentaire> getAllCommentaires();

	ResponseEntity<Void> addCommentaire(Commentaire commentaire);

	ResponseEntity<Void> deleteCommentaireById(Long articleId, Long membreCin);

	ResponseEntity<Void> updateCommentaire(Commentaire commentaire, Long articleId, Long membreCin);

	ResponseEntity<Commentaire> getCommentaire(Long articleId, Long membreCin);
}

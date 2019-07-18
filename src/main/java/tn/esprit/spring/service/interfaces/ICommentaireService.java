package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Commentaire;

public interface ICommentaireService {

	List<Commentaire> getAllCommentaires();

	Long addCommentaire(Commentaire commentaire);

	void deleteCommentaireById(Long id);

	void deleteCommentaire(Commentaire commentaire);

	void updateCommentaire(Commentaire commentaire, Long id);

	Commentaire getCommentaire(Long id);
}

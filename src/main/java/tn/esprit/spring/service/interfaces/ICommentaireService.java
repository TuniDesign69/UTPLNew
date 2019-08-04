package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Commentaire;
import tn.esprit.spring.entity.CommentairePk;

public interface ICommentaireService {

	List<Commentaire> getAllCommentaires();

	boolean addCommentaire(Commentaire commentaire);

	void deleteCommentaireById(CommentairePk id);

	void deleteCommentaire(Commentaire commentaire);

	void updateCommentaire(Commentaire commentaire, CommentairePk id);

	Commentaire getCommentaire(CommentairePk id);
}

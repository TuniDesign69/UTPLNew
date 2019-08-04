package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Commentaire;
import tn.esprit.spring.entity.CommentairePk;
import tn.esprit.spring.repository.ArticleRepository;
import tn.esprit.spring.repository.CommentaireRepository;
import tn.esprit.spring.repository.MembreRepository;
import tn.esprit.spring.service.interfaces.ICommentaireService;
@Service
public class CommentaireServiceImpl implements ICommentaireService {

	@Autowired
	CommentaireRepository commentaireRepo;

	@Autowired
	MembreRepository membreRepo;
	
	@Autowired
	ArticleRepository articleRepo;

	@Override
	public List<Commentaire> getAllCommentaires() {
		// TODO Auto-generated method stub
		return (List<Commentaire>) commentaireRepo.findAll();
	}

	@Override
	public boolean addCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub
		try{
			commentaireRepo.save(commentaire);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public void deleteCommentaireById(CommentairePk id) {
		// TODO Auto-generated method stub
		commentaireRepo.deleteById(id);
	}

	@Override
	public void deleteCommentaire(Commentaire commentaire) {
		// TODO Auto-generated method stub
		commentaireRepo.delete(commentaire);
	}

	@Override
	public void updateCommentaire(Commentaire commentaire, CommentairePk id) {
		// TODO Auto-generated method stub

		Commentaire existing = commentaireRepo.findById(id).get();
		if (existing != null) {
			commentaire.setCommentairePk(id);;
			existing = commentaire;
			commentaireRepo.save(existing);
		}
	}

	@Override
	public Commentaire getCommentaire(CommentairePk id) {
		// TODO Auto-generated method stub
		return commentaireRepo.findById(id).get();
	}

}

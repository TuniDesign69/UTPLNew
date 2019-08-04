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

import tn.esprit.spring.controller.interfaces.ICommentaireController;
import tn.esprit.spring.entity.Commentaire;
import tn.esprit.spring.entity.CommentairePk;
import tn.esprit.spring.service.interfaces.ICommentaireService;

@RestController
@RequestMapping("/commentaire")
@CrossOrigin(origins="http://localhost:4200")
public class CommentaireController implements ICommentaireController {

	@Autowired
	ICommentaireService commentaireService;

	@Override
	@GetMapping("/list")
	@ResponseBody
	public List<Commentaire> getAllCommentaires() {
		// TODO Auto-generated method stub
		return commentaireService.getAllCommentaires();
	}

	@Override
	@PostMapping("/add/")
	public ResponseEntity<Void> addCommentaire(@RequestBody Commentaire commentaire) {
		// TODO Auto-generated method stub
		if (commentaireService.addCommentaire(commentaire))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@DeleteMapping("/delete/{articleId}/{membreCin}")
	public ResponseEntity<Void> deleteCommentaireById(@PathVariable("articleId") Long articleId, @PathVariable("membreCin") Long membreCin) {
		// TODO Auto-generated method stub
		CommentairePk pk = new CommentairePk();
		pk.setArticleId(articleId);
		pk.setMembreCin(membreCin);
		commentaireService.deleteCommentaireById(pk);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@PutMapping("/edit/{articleId}/{membreCin}")
	public ResponseEntity<Void> updateCommentaire(@RequestBody Commentaire commentaire, @PathVariable("articleId") Long articleId, @PathVariable("membreCin") Long membreCin) {
		// TODO Auto-generated method stub
		CommentairePk pk = new CommentairePk();
		pk.setArticleId(articleId);
		pk.setMembreCin(membreCin);
		commentaireService.updateCommentaire(commentaire, pk);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@GetMapping("details/{articleId}/{membreCin}")
	public ResponseEntity<Commentaire> getCommentaire(@PathVariable("articleId") Long articleId, @PathVariable("membreCin") Long membreCin) {
		// TODO Auto-generated method stub
		CommentairePk pk = new CommentairePk();
		pk.setArticleId(articleId);
		pk.setMembreCin(membreCin);
		Commentaire commentaire = commentaireService.getCommentaire(pk);
		if (commentaire == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(commentaire, HttpStatus.OK);
	}

}

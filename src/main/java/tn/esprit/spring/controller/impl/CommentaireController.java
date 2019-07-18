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

import tn.esprit.spring.controller.interfaces.ICommentaireController;
import tn.esprit.spring.entity.Commentaire;
import tn.esprit.spring.service.interfaces.ICommentaireService;

@RestController
@RequestMapping("/")
public class CommentaireController implements ICommentaireController {

	@Autowired
	ICommentaireService commentaireService;

	@Override
	@RequestMapping(value = "/commentaires", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Commentaire> getAllCommentaires() {
		// TODO Auto-generated method stub
		return commentaireService.getAllCommentaires();
	}

	@Override
	@RequestMapping(value = "/addcommentaire/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addCommentaire(@RequestBody Commentaire commentaire) {
		// TODO Auto-generated method stub
		Long id = commentaireService.addCommentaire(commentaire);
		if (id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@RequestMapping(value = "/commentaire/{commentaireId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCommentaireById(@PathVariable("commentaireId") Long id) {
		// TODO Auto-generated method stub
		commentaireService.deleteCommentaireById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/commentaire/{commentaireId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateCommentaire(@RequestBody Commentaire commentaire, @PathVariable("commentaireId") Long id) {
		// TODO Auto-generated method stub
		commentaireService.updateCommentaire(commentaire, id);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@RequestMapping(value = "/commentaire/{commentaireId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Commentaire> getCommentaire(Long id) {
		// TODO Auto-generated method stub
		Commentaire commentaire = commentaireService.getCommentaire(id);
		if (commentaire == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(commentaire, HttpStatus.OK);
	}

}

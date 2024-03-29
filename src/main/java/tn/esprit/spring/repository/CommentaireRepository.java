package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Commentaire;
import tn.esprit.spring.entity.CommentairePk;
@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, CommentairePk> {

}

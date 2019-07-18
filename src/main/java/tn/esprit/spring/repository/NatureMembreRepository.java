package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.NatureMembre;
@Repository
public interface NatureMembreRepository extends CrudRepository<NatureMembre, Long> {

}

package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CommissionMembreAffectation;
import tn.esprit.spring.entity.CommissionMembreAffectationPK;

@Repository
public interface CommissionMembreAffectationRepository extends CrudRepository<CommissionMembreAffectation, CommissionMembreAffectationPK>{

}

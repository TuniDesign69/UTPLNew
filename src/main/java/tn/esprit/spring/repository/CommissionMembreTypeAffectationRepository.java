package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CommissionMembreTypeAffectation;

@Repository
public interface CommissionMembreTypeAffectationRepository extends CrudRepository<CommissionMembreTypeAffectation, Long> {

}

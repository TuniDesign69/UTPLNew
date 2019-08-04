package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.CommissionMembreTypeAffectation;

public interface ICommissionMembreTypeAffectationController {
	
	List<CommissionMembreTypeAffectation> getAllCommissionMembreTypeAffectations();

	ResponseEntity<Void> addCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation);

	ResponseEntity<Void> deleteCommissionMembreTypeAffectationById(Long id);

	ResponseEntity<Void> updateCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation, Long id);

	ResponseEntity<CommissionMembreTypeAffectation> getCommissionMembreTypeAffectation(Long id);
}

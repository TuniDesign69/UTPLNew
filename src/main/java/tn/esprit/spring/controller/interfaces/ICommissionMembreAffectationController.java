package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.CommissionMembreAffectation;

public interface ICommissionMembreAffectationController {
	
	List<CommissionMembreAffectation> getAllCommissionMembreAffectations();

	ResponseEntity<Void> addCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation);

	ResponseEntity<Void> deleteCommissionMembreAffectationById(Long commissionId, Long membreCin);

	ResponseEntity<Void> updateCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation, Long commissionId, Long membreCin);

	ResponseEntity<CommissionMembreAffectation> getCommissionMembreAffectation(Long commissionId, Long membreCin);

}

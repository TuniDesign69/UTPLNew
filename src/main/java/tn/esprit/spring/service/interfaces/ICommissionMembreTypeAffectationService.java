package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.CommissionMembreTypeAffectation;

public interface ICommissionMembreTypeAffectationService {
	
	List<CommissionMembreTypeAffectation> getAllCommissionMembreTypeAffectations();

	Long addCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation);

	void deleteCommissionMembreTypeAffectationById(Long id);

	void deleteCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation);

	void updateCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation, Long id);

	CommissionMembreTypeAffectation getCommissionMembreTypeAffectation(Long id);
}
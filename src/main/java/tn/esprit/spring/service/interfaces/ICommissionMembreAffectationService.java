package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.CommissionMembreAffectation;
import tn.esprit.spring.entity.CommissionMembreAffectationPK;

public interface ICommissionMembreAffectationService {
	
	List<CommissionMembreAffectation> getAllCommissionMembreAffectations();

	Boolean addCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation);

	void deleteCommissionMembreAffectationById(CommissionMembreAffectationPK id);

	void deleteCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation);

	void updateCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation, CommissionMembreAffectationPK id);

	CommissionMembreAffectation getCommissionMembreAffectation(CommissionMembreAffectationPK id);
}

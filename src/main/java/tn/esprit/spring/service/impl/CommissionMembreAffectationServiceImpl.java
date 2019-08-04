package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.CommissionMembreAffectation;
import tn.esprit.spring.entity.CommissionMembreAffectationPK;
import tn.esprit.spring.repository.CommissionMembreAffectationRepository;
import tn.esprit.spring.repository.CommissionRepository;
import tn.esprit.spring.repository.MembreRepository;
import tn.esprit.spring.service.interfaces.ICommissionMembreAffectationService;

@Service
public class CommissionMembreAffectationServiceImpl implements ICommissionMembreAffectationService {

	@Autowired
	CommissionMembreAffectationRepository commissionMembreAffectationRepo;
	
	@Autowired
	CommissionRepository commissionRepo;
	
	@Autowired
	MembreRepository membreRepo; 
	
	@Override
	public List<CommissionMembreAffectation> getAllCommissionMembreAffectations() {
		// TODO Auto-generated method stub
		return (List<CommissionMembreAffectation>) commissionMembreAffectationRepo.findAll();
	}

	@Override
	public Boolean addCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation) {
		// TODO Auto-generated method stub
		try{
			commissionMembreAffectationRepo.save(commissionMembreAffectation);
			return true;
		} catch(Exception e){
			return false;
		}
	}

	@Override
	public void deleteCommissionMembreAffectationById(CommissionMembreAffectationPK id) {
		// TODO Auto-generated method stub
		commissionMembreAffectationRepo.deleteById(id);
	}

	@Override
	public void deleteCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation) {
		// TODO Auto-generated method stub
		commissionMembreAffectationRepo.delete(commissionMembreAffectation);
	}

	@Override
	public void updateCommissionMembreAffectation(CommissionMembreAffectation commissionMembreAffectation,
			CommissionMembreAffectationPK id) {
		// TODO Auto-generated method stub
		CommissionMembreAffectation existing = commissionMembreAffectationRepo.findById(id).get();
		if(existing != null){
			commissionMembreAffectation.setCommissionMembreAffectationPk(id);
			existing = commissionMembreAffectation;
			commissionMembreAffectationRepo.save(existing);
		}
	}

	@Override
	public CommissionMembreAffectation getCommissionMembreAffectation(CommissionMembreAffectationPK id) {
		// TODO Auto-generated method stub
		return commissionMembreAffectationRepo.findById(id).get();
	}

}

package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.CommissionMembreTypeAffectation;
import tn.esprit.spring.repository.CommissionMembreTypeAffectationRepository;
import tn.esprit.spring.service.interfaces.ICommissionMembreTypeAffectationService;

@Service
public class CommissionMembreTypeAffectationServiceImpl implements ICommissionMembreTypeAffectationService {

	@Autowired
	CommissionMembreTypeAffectationRepository commissionMembreTypeAffectationRepo;

	@Override
	public List<CommissionMembreTypeAffectation> getAllCommissionMembreTypeAffectations() {
		// TODO Auto-generated method stub
		return (List<CommissionMembreTypeAffectation>) commissionMembreTypeAffectationRepo.findAll();
	}

	@Override
	public Long addCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation) {
		// TODO Auto-generated method stub
		try {
			commissionMembreTypeAffectationRepo.save(commissionMembreTypeAffectation);
		} catch (Exception e) {
			return -1L;
		}
		return commissionMembreTypeAffectation.getCommissionMembreTypeAffectationId();
	}

	@Override
	public void deleteCommissionMembreTypeAffectationById(Long id) {
		// TODO Auto-generated method stub
		commissionMembreTypeAffectationRepo.deleteById(id);
	}

	@Override
	public void deleteCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation) {
		// TODO Auto-generated method stub
		commissionMembreTypeAffectationRepo.delete(commissionMembreTypeAffectation);
	}

	@Override
	public void updateCommissionMembreTypeAffectation(CommissionMembreTypeAffectation commissionMembreTypeAffectation,
			Long id) {
		// TODO Auto-generated method stub

		CommissionMembreTypeAffectation existing = commissionMembreTypeAffectationRepo.findById(id).get();
		if(existing != null){
			commissionMembreTypeAffectation.setCommissionMembreTypeAffectationId(id);
			existing = commissionMembreTypeAffectation;
			commissionMembreTypeAffectationRepo.save(existing);
		}
	}

	@Override
	public CommissionMembreTypeAffectation getCommissionMembreTypeAffectation(Long id) {
		// TODO Auto-generated method stub
		return commissionMembreTypeAffectationRepo.findById(id).get();
	}

}

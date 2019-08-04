package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Commission;
import tn.esprit.spring.repository.CommissionRepository;
import tn.esprit.spring.service.interfaces.ICommissionService;

@Service
public class CommissionServiceImpl implements ICommissionService{

	@Autowired
	CommissionRepository commissionRepo;
	
	@Override
	public List<Commission> getAllCommissions() {
		// TODO Auto-generated method stub
		return (List<Commission>) commissionRepo.findAll();
	}

	@Override
	public Long addCommission(Commission commission) {
		// TODO Auto-generated method stub

		try{
			commissionRepo.save(commission);
		} catch (Exception e){
			return -1L;
		}
		return commission.getCommissionId();
	}

	@Override
	public void deleteCommissionById(Long id) {
		// TODO Auto-generated method stub
			commissionRepo.deleteById(id);;
	}

	@Override
	public void deleteCommission(Commission commission) {
		// TODO Auto-generated method stub
		commissionRepo.delete(commission);
	}

	@Override
	public void updateCommission(Commission commission, Long id) {
		// TODO Auto-generated method stub
		Commission existing = commissionRepo.findById(id).get();
		if(existing != null){
			commission.setCommissionId(id);
			existing = commission;
			commissionRepo.save(existing);
		}
	}

	@Override
	public Commission getCommission(Long id) {
		// TODO Auto-generated method stub
		return commissionRepo.findById(id).get();
	}

}

package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Commission;

public interface ICommissionService {
	
	List<Commission> getAllCommissions();

	Long addCommission(Commission commission);

	void deleteCommissionById(Long id);

	void deleteCommission(Commission commission);

	void updateCommission(Commission commission, Long id);

	Commission getCommission(Long id);
}

package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Commission;

public interface ICommissionController {
	
	List<Commission> getAllCommissions();

	ResponseEntity<Void> addCommission(Commission commission);

	ResponseEntity<Void> deleteCommissionById(Long id);

	ResponseEntity<Void> updateCommission(Commission commission, Long id);

	ResponseEntity<Commission> getCommission(Long id);
}

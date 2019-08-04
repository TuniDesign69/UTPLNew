package tn.esprit.spring.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.ICommissionMembreTypeAffectationController;
import tn.esprit.spring.entity.CommissionMembreTypeAffectation;
import tn.esprit.spring.service.interfaces.ICommissionMembreTypeAffectationService;

@RestController
@RequestMapping("/commissionMembreTypeAffectation")
@CrossOrigin(origins = "http://localhost:4200")
public class CommissionMembreTypeAffectationController implements ICommissionMembreTypeAffectationController {

	@Autowired
	ICommissionMembreTypeAffectationService commissionMembreTypeAffectationService;

	@Override
	@GetMapping("/list")
	@ResponseBody
	public List<CommissionMembreTypeAffectation> getAllCommissionMembreTypeAffectations() {
		// TODO Auto-generated method stub
		return commissionMembreTypeAffectationService.getAllCommissionMembreTypeAffectations();
	}

	@Override
	@PostMapping("/add/")
	public ResponseEntity<Void> addCommissionMembreTypeAffectation(
			@RequestBody CommissionMembreTypeAffectation commissionMembreTypeAffectation) {
		// TODO Auto-generated method stub
		Long id = commissionMembreTypeAffectationService
				.addCommissionMembreTypeAffectation(commissionMembreTypeAffectation);
		if (id == -1) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCommissionMembreTypeAffectationById(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		commissionMembreTypeAffectationService.deleteCommissionMembreTypeAffectationById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@PutMapping("/edit/{id}")
	public ResponseEntity<Void> updateCommissionMembreTypeAffectation(
			@RequestBody CommissionMembreTypeAffectation commissionMembreTypeAffectation, @PathVariable("id") Long id) {
		commissionMembreTypeAffectationService.updateCommissionMembreTypeAffectation(commissionMembreTypeAffectation,
				id);
		// TODO Auto-generated method stub
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@GetMapping("details/{id}")
	public ResponseEntity<CommissionMembreTypeAffectation> getCommissionMembreTypeAffectation(
			@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		CommissionMembreTypeAffectation c = commissionMembreTypeAffectationService.getCommissionMembreTypeAffectation(id);
		if (c == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(c, HttpStatus.OK);
	}

}

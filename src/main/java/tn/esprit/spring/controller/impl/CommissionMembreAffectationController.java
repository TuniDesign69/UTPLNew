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

import tn.esprit.spring.controller.interfaces.ICommissionMembreAffectationController;
import tn.esprit.spring.entity.CommissionMembreAffectation;
import tn.esprit.spring.entity.CommissionMembreAffectationPK;
import tn.esprit.spring.service.interfaces.ICommissionMembreAffectationService;

@RestController
@RequestMapping("/commissionMembreAffectation")
@CrossOrigin(origins = "http://localhost:4200")
public class CommissionMembreAffectationController implements ICommissionMembreAffectationController {

	@Autowired
	ICommissionMembreAffectationService commissionMembreAffectationService;

	@Override
	@GetMapping("/list")
	@ResponseBody
	public List<CommissionMembreAffectation> getAllCommissionMembreAffectations() {
		// TODO Auto-generated method stub
		return commissionMembreAffectationService.getAllCommissionMembreAffectations();
	}

	@Override
	@PostMapping("/add/")
	public ResponseEntity<Void> addCommissionMembreAffectation(
			@RequestBody CommissionMembreAffectation commissionMembreAffectation) {
		// TODO Auto-generated method stub
		if (commissionMembreAffectationService.addCommissionMembreAffectation(commissionMembreAffectation))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@DeleteMapping("/delete/{commissionId}/{membreCin}")
	public ResponseEntity<Void> deleteCommissionMembreAffectationById(@PathVariable("commissionId") Long commissionId,
			@PathVariable("membreCin") Long membreCin) {
		// TODO Auto-generated method stub
		CommissionMembreAffectationPK pk = new CommissionMembreAffectationPK();
		pk.setCommissionId(commissionId);
		pk.setMembreCin(membreCin);
		commissionMembreAffectationService.deleteCommissionMembreAffectationById(pk);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@PutMapping("/edit/{commissionId}/{membreCin}")
	public ResponseEntity<Void> updateCommissionMembreAffectation(
			@RequestBody CommissionMembreAffectation commissionMembreAffectation,
			@PathVariable("commissionId") Long commissionId, @PathVariable("membreCin") Long membreCin) {
		// TODO Auto-generated method stub
		CommissionMembreAffectationPK pk = new CommissionMembreAffectationPK();
		pk.setCommissionId(commissionId);
		pk.setMembreCin(membreCin);
		commissionMembreAffectationService.updateCommissionMembreAffectation(commissionMembreAffectation, pk);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@GetMapping("details/{commissionId}/{membreCin}")
	public ResponseEntity<CommissionMembreAffectation> getCommissionMembreAffectation(
			@PathVariable("commissionId") Long commissionId, @PathVariable("membreCin") Long membreCin) {
		// TODO Auto-generated method stub
		CommissionMembreAffectationPK pk = new CommissionMembreAffectationPK();
		pk.setCommissionId(commissionId);
		pk.setMembreCin(membreCin);
		CommissionMembreAffectation commissionMembreAffectation = commissionMembreAffectationService
				.getCommissionMembreAffectation(pk);
		if (commissionMembreAffectation == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(commissionMembreAffectation, HttpStatus.OK);
	}

}

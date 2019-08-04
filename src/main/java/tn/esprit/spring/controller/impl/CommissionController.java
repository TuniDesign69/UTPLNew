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

import tn.esprit.spring.controller.interfaces.ICommissionController;
import tn.esprit.spring.entity.Commission;
import tn.esprit.spring.service.interfaces.ICommissionService;

@RestController
@RequestMapping("/commission")
@CrossOrigin(origins="http://localhost:4200")
public class CommissionController implements ICommissionController{

	@Autowired
	ICommissionService commissionService;
	
	@Override
	@GetMapping("/list")
	@ResponseBody
	public List<Commission> getAllCommissions() {
		// TODO Auto-generated method stub
		return commissionService.getAllCommissions();
	}

	@Override
	@PostMapping("/add/")
	public ResponseEntity<Void> addCommission(@RequestBody Commission commission) {
		// TODO Auto-generated method stub
		Long id = commissionService.addCommission(commission);
		if(id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@DeleteMapping("/delete/{commissionId}")
	public ResponseEntity<Void> deleteCommissionById(@PathVariable("commissionId") Long id) {
		// TODO Auto-generated method stub
		commissionService.deleteCommissionById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@PutMapping("/edit/{commissionId}")
	public ResponseEntity<Void> updateCommission(@RequestBody Commission commission, @PathVariable("commissionId") Long id) {
		// TODO Auto-generated method stub
		commissionService.updateCommission(commission, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@GetMapping("/details/{commissionId}")
	public ResponseEntity<Commission> getCommission(Long id) {
		// TODO Auto-generated method stub
		Commission commission = commissionService.getCommission(id);
		if (commission == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(commission, HttpStatus.OK);
		}

}

package tn.esprit.spring.controller.impl;

import java.util.Date;
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
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.IMembreController;
import tn.esprit.spring.entity.Membre;
import tn.esprit.spring.repository.MembreRepository;
import tn.esprit.spring.service.interfaces.IMembreService;

@RestController
@RequestMapping("/membre")
@CrossOrigin(origins="http://localhost:4200")
public class MembreController implements IMembreController {

	@Autowired
	IMembreService membreService;

	@Autowired
	MembreRepository membreRepo;

	@PostMapping(path = "/login/{username}/{password}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> login(@PathVariable("username") String username, @PathVariable("password") String password) {
		if ((membreRepo.login(username, password).isEmpty() == false)) {
			Membre loggedMembre = (Membre) (membreRepo.login(username, password).get(0));
			loggedMembre.setMembreLastLogin(new Date());
			return new ResponseEntity<>(loggedMembre, HttpStatus.OK);
		}
		return new ResponseEntity<>("{\"response\" : \"invalid username or password\"}", HttpStatus.OK);

	}

	@Override
	@GetMapping("/list")
	public List<Membre> getAllMembres() {
		// TODO Auto-generated method stub
		return membreService.getAllMembres();
	}

	@Override
	@PostMapping("/add/")
	public ResponseEntity<Void> addMembre(@RequestBody Membre membre) {
		// TODO Auto-generated method stub
		Long id = membreService.addMembre(membre);
		System.out.println(id);
		if (id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@DeleteMapping("/delete/{membreId}")
	public ResponseEntity<Void> deleteMembreById(@PathVariable("membreId") Long id) {
		// TODO Auto-generated method stub
		membreService.deleteMembreById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@PutMapping("/edit/{membreId}")
	public ResponseEntity<Void> updateMembre(@RequestBody Membre membre, @PathVariable("membreId") Long id) {
		// TODO Auto-generated method stub
		membreService.updateMembre(membre, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@GetMapping("details/{membreId}")
	public ResponseEntity<Membre> getMembre(@PathVariable("membreId") Long id) {
		// TODO Auto-generated method stub
		Membre membre = membreService.getMembre(id);
		if (membre == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(membre, HttpStatus.OK);
	}

}

package tn.esprit.spring.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.INatureMembreController;
import tn.esprit.spring.entity.NatureMembre;
import tn.esprit.spring.service.interfaces.INatureMembreService;

@RestController
@RequestMapping("/")
public class NatureMembreController implements INatureMembreController{


	@Autowired
	INatureMembreService natureMembreService;
	
	@Override
	@RequestMapping(value = "/natures", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<NatureMembre> getAllNatureMembres() {
		// TODO Auto-generated method stub
		return natureMembreService.getAllNatureMembres();
	}

	@Override
	@RequestMapping(value = "/addnature/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addNatureMembre(@RequestBody NatureMembre nature) {
		// TODO Auto-generated method stub
		Long id = natureMembreService.addNatureMembre(nature);
		if (id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
		}

	@Override
	@RequestMapping(value = "/nature/{natureId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteNatureMembreById(@PathVariable("natureId") Long id) {
		// TODO Auto-generated method stub
		natureMembreService.deleteNatureMembreById(id);
		return new ResponseEntity<>(HttpStatus.OK);
		}

	@Override
	@RequestMapping(value = "/nature/{natureId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateNatureMembre(@RequestBody NatureMembre nature, @PathVariable("natureId") Long id) {
		// TODO Auto-generated method stub
		natureMembreService.updateNatureMembre(nature, id);
		return new ResponseEntity<>(HttpStatus.OK);
		}

	@Override
	@RequestMapping(value = "/nature/{natureId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NatureMembre> getNatureMembre(@PathVariable("natureId") Long id) {
		// TODO Auto-generated method stub
		NatureMembre nature = natureMembreService.getNatureMembre(id);
		if (nature == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(nature, HttpStatus.OK);
	}

}

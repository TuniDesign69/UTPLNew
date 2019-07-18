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

import tn.esprit.spring.controller.interfaces.IRoleMembreController;
import tn.esprit.spring.entity.RoleMembre;
import tn.esprit.spring.service.interfaces.IRoleMembreService;

@RestController
@RequestMapping("/")
public class RoleMembreController implements IRoleMembreController {

	@Autowired
	IRoleMembreService roleMembreService;
	
	@Override
	@RequestMapping(value = "/roles", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<RoleMembre> getAllRoleMembres() {
		// TODO Auto-generated method stub
		return roleMembreService.getAllRoleMembres();
	}

	@Override
	@RequestMapping(value = "/addrole/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addRoleMembre(@RequestBody RoleMembre role) {
		// TODO Auto-generated method stub
		Long id = roleMembreService.addRoleMembre(role);
		if (id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
		}

	@Override
	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteRoleMembreById(@PathVariable("roleId") Long id) {
		// TODO Auto-generated method stub
		roleMembreService.deleteRoleMembreById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateRoleMembre(@RequestBody RoleMembre role, @PathVariable("roleId") Long id) {
		// TODO Auto-generated method stub
		roleMembreService.updateRoleMembre(role, id);
		return new ResponseEntity<>(HttpStatus.OK);	}

	@Override
	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoleMembre> getRoleMembre(@PathVariable("roleId") Long id) {
		// TODO Auto-generated method stub
		RoleMembre role = roleMembreService.getRoleMembre(id);
		if (role == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(role, HttpStatus.OK);
	}

}

package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.RoleMembre;

public interface IRoleMembreController {

	List<RoleMembre> getAllRoleMembres();

	ResponseEntity<Void> addRoleMembre(RoleMembre role);

	ResponseEntity<Void> deleteRoleMembreById(Long id);

	ResponseEntity<Void> updateRoleMembre(RoleMembre role, Long id);

	ResponseEntity<RoleMembre> getRoleMembre(Long id);
}

package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.RoleMembre;

public interface IRoleMembreService {

	List<RoleMembre> getAllRoleMembres();

	Long addRoleMembre(RoleMembre role);

	void deleteRoleMembreById(Long id);

	void deleteRoleMembre(RoleMembre role);

	void updateRoleMembre(RoleMembre role, Long id);

	RoleMembre getRoleMembre(Long id);
}

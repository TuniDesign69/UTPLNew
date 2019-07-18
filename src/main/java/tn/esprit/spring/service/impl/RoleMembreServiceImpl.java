package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.RoleMembre;
import tn.esprit.spring.repository.RoleMembreRepository;
import tn.esprit.spring.service.interfaces.IRoleMembreService;
@Service
public class RoleMembreServiceImpl implements IRoleMembreService {

	@Autowired
	RoleMembreRepository roleMembreRepo;

	@Override
	public List<RoleMembre> getAllRoleMembres() {
		// TODO Auto-generated method stub
		return (List<RoleMembre>) roleMembreRepo.findAll();
	}

	@Override
	public Long addRoleMembre(RoleMembre role) {
		// TODO Auto-generated method stub
		try {
			roleMembreRepo.save(role);
		} catch (Exception ex) {
			return -1L;
		}
		return role.getRoleId();
	}

	@Override
	public void deleteRoleMembreById(Long id) {
		// TODO Auto-generated method stub
		roleMembreRepo.deleteById(id);
	}

	@Override
	public void deleteRoleMembre(RoleMembre role) {
		// TODO Auto-generated method stub
		roleMembreRepo.delete(role);
	}

	@Override
	public void updateRoleMembre(RoleMembre role, Long id) {
		// TODO Auto-generated method stub
		RoleMembre existing = roleMembreRepo.findById(id).get();
		if (existing != null) {
			role.setRoleId(id);
			existing = role;
			roleMembreRepo.save(existing);
		}
	}

	@Override
	public RoleMembre getRoleMembre(Long id) {
		// TODO Auto-generated method stub
		return roleMembreRepo.findById(id).get();
	}

}

package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Membre;
import tn.esprit.spring.repository.MembreRepository;
import tn.esprit.spring.service.interfaces.IMembreService;
@Service
public class MembreServiceImpl implements IMembreService {

	@Autowired
	MembreRepository membreRepo;

	@Override
	public List<Membre> getAllMembres() {
		// TODO Auto-generated method stub
		return (List<Membre>) membreRepo.findAll();
	}

	@Override
	public Long addMembre(Membre membre) {
		// TODO Auto-generated method stub
		try {
			membreRepo.save(membre);
		} catch (Exception ex) {
			return -1L;
		}
		return membre.getMembreCin();
	}

	@Override
	public void deleteMembreById(Long id) {
		// TODO Auto-generated method stub
		membreRepo.deleteById(id);
	}

	@Override
	public void deleteMembre(Membre membre) {
		// TODO Auto-generated method stub
		membreRepo.delete(membre);
	}

	@Override
	public void updateMembre(Membre membre, Long id) {
		// TODO Auto-generated method stub
		Membre existing = membreRepo.findById(id).get();
		if (existing != null) {
			membre.setMembreCin(id);
			existing = membre;
			membreRepo.save(existing);
		}
	}

	@Override
	public Membre getMembre(Long id) {
		// TODO Auto-generated method stub
		return membreRepo.findById(id).get();
	}

}

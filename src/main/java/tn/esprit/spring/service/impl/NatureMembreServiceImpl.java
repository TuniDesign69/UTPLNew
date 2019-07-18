package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.NatureMembre;
import tn.esprit.spring.repository.NatureMembreRepository;
import tn.esprit.spring.service.interfaces.INatureMembreService;
@Service
public class NatureMembreServiceImpl implements INatureMembreService {

	@Autowired
	NatureMembreRepository natureMembreRepo;

	@Override
	public List<NatureMembre> getAllNatureMembres() {
		// TODO Auto-generated method stub
		return (List<NatureMembre>) natureMembreRepo.findAll();
	}

	@Override
	public Long addNatureMembre(NatureMembre nature) {
		// TODO Auto-generated method stub
		try {
			natureMembreRepo.save(nature);
		} catch (Exception ex) {
			return -1L;
		}
		return nature.getNatureMembreId();
	}

	@Override
	public void deleteNatureMembreById(Long id) {
		// TODO Auto-generated method stub
		natureMembreRepo.deleteById(id);
	}

	@Override
	public void deleteNatureMembre(NatureMembre nature) {
		// TODO Auto-generated method stub
		natureMembreRepo.delete(nature);
	}

	@Override
	public void updateNatureMembre(NatureMembre nature, Long id) {
		// TODO Auto-generated method stub
		NatureMembre existing = natureMembreRepo.findById(id).get();
		if (existing != null) {
			nature.setNatureMembreId(id);
			existing = nature;
			natureMembreRepo.save(existing);
		}
	}

	@Override
	public NatureMembre getNatureMembre(Long id) {
		// TODO Auto-generated method stub
		return natureMembreRepo.findById(id).get();
	}

}

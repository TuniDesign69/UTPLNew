package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Membre;

public interface IMembreService {

	List<Membre> getAllMembres();

	Long addMembre(Membre membre);

	void deleteMembreById(Long id);

	void deleteMembre(Membre membre);

	void updateMembre(Membre membre, Long id);

	Membre getMembre(Long id);
}

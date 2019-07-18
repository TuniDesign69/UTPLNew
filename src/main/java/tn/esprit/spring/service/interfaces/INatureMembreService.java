package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.NatureMembre;

public interface INatureMembreService {

	List<NatureMembre> getAllNatureMembres();

	Long addNatureMembre(NatureMembre nature);

	void deleteNatureMembreById(Long id);

	void deleteNatureMembre(NatureMembre nature);

	void updateNatureMembre(NatureMembre nature, Long id);

	NatureMembre getNatureMembre(Long id);
}

package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.repository.CategorieRepository;
import tn.esprit.spring.service.interfaces.ICategorieService;
@Service
public class CategorieServiceImpl implements ICategorieService {

	@Autowired
	CategorieRepository categorieRepo;

	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return (List<Categorie>) categorieRepo.findAll();
	}

	@Override
	public Long addCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		try {
			categorieRepo.save(categorie);
		} catch (Exception ex) {
			return -1L;
		}
		return categorie.getCategorieId();
	}

	@Override
	public void deleteCategorieById(Long id) {
		// TODO Auto-generated method stub
		categorieRepo.deleteById(id);
	}

	@Override
	public void deleteCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		categorieRepo.delete(categorie);
	}

	@Override
	public void updateCategorie(Categorie categorie, Long id) {
		// TODO Auto-generated method stub
		Categorie existing = categorieRepo.findById(id).get();
		if (existing != null) {
			categorie.setCategorieId(id);
			existing = categorie;
			categorieRepo.save(existing);
		}
	}

	@Override
	public Categorie getCategorie(Long id) {
		// TODO Auto-generated method stub
		return categorieRepo.findById(id).get();
	}

}

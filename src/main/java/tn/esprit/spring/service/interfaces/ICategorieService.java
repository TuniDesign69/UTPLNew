package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Categorie;

public interface ICategorieService {

	List<Categorie> getAllCategories();

	Long addCategorie(Categorie categorie);

	void deleteCategorieById(Long id);

	void deleteCategorie(Categorie categorie);

	void updateCategorie(Categorie categorie, Long id);

	Categorie getCategorie(Long id);
}

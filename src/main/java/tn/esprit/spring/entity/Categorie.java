package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long CategorieId;
	
	private String CategorieLibelle;
	private String CategorieDescription;
	
	@OneToMany(mappedBy="ForumCategorie")
	private List<Forum> CategorieForums;
	
	public Categorie() {
	}

	public Long getCategorieId() {
		return CategorieId;
	}

	public void setCategorieId(Long categorieId) {
		CategorieId = categorieId;
	}

	public String getCategorieLibelle() {
		return CategorieLibelle;
	}

	public void setCategorieLibelle(String categorieLibelle) {
		CategorieLibelle = categorieLibelle;
	}

	public String getCategorieDescription() {
		return CategorieDescription;
	}

	public void setCategorieDescription(String categorieDescription) {
		CategorieDescription = categorieDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Categorie [CategorieId=" + CategorieId + ", CategorieLibelle=" + CategorieLibelle
				+ ", CategorieDescription=" + CategorieDescription + "]";
	}

	
}

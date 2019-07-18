package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NatureMembre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long NatureMembreId;
	
	private String NatureMembreLibelle;
	private String NatureMembreDescription;
	
	@OneToMany(mappedBy="MembreNature")
	private List<Membre> NatureMembreListMembre;
	
	public NatureMembre() {
	}

	public Long getNatureMembreId() {
		return NatureMembreId;
	}

	public void setNatureMembreId(Long natureMembreId) {
		NatureMembreId = natureMembreId;
	}

	public String getNatureMembreLibelle() {
		return NatureMembreLibelle;
	}

	public void setNatureMembreLibelle(String natureMembreLibelle) {
		NatureMembreLibelle = natureMembreLibelle;
	}

	public String getNatureMembreDescription() {
		return NatureMembreDescription;
	}

	public void setNatureMembreDescription(String natureMembreDescription) {
		NatureMembreDescription = natureMembreDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NatureMembre [NatureMembreId=" + NatureMembreId + ", NatureMembreLibelle=" + NatureMembreLibelle
				+ ", NatureMembreDescription=" + NatureMembreDescription + "]";
	}

}

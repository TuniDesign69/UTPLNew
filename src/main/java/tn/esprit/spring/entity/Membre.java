package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Membre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long MembreCin;
	private String MembreNom;
	private String MembrePrenom;
	@Temporal(TemporalType.DATE)
	private Date MembreDateDeNaissance;
	private String MembreUsername;
	private String MembrePassword;
	private Date MembreLastLogin;
	private boolean MembreIsActif;
	private String MembreEmail;
	
	@ManyToOne
	@JoinColumn(name="fk_membre_role")
	private RoleMembre MembreRole;
	
	@ManyToOne
	@JoinColumn(name="fk_membre_nature")
	private NatureMembre MembreNature;
	
	@ManyToMany(mappedBy="ForumListMembres")
	private List<Forum> MembreListForums;
	
	@OneToMany(mappedBy = "membre")
	private List<CommissionMembreAffectation> commissionMembreAffectations; 
	
	@OneToMany(mappedBy = "CommentaireMembre")
	private List<Commentaire> commentaire; 
	
	public Membre() {
	}

	public Long getMembreCin() {
		return MembreCin;
	}

	public void setMembreCin(Long membreCin) {
		MembreCin = membreCin;
	}

	public String getMembreNom() {
		return MembreNom;
	}

	public void setMembreNom(String membreNom) {
		MembreNom = membreNom;
	}

	public String getMembrePrenom() {
		return MembrePrenom;
	}

	public void setMembrePrenom(String membrePrenom) {
		MembrePrenom = membrePrenom;
	}

	public Date getMembreDateDeNaissance() {
		return MembreDateDeNaissance;
	}

	public void setMembreDateDeNaissance(Date membreDateDeNaissance) {
		MembreDateDeNaissance = membreDateDeNaissance;
	}

	public String getMembreUsername() {
		return MembreUsername;
	}

	public void setMembreUsername(String membreUsername) {
		MembreUsername = membreUsername;
	}

	public String getMembrePassword() {
		return MembrePassword;
	}

	public void setMembrePassword(String membrePassword) {
		MembrePassword = membrePassword;
	}

	public Date getMembreLastLogin() {
		return MembreLastLogin;
	}

	public void setMembreLastLogin(Date membreLastLogin) {
		MembreLastLogin = membreLastLogin;
	}

	public boolean isMembreIsActif() {
		return MembreIsActif;
	}

	public void setMembreIsActif(boolean membreIsActif) {
		MembreIsActif = membreIsActif;
	}

	public String getMembreEmail() {
		return MembreEmail;
	}

	public void setMembreEmail(String membreEmail) {
		MembreEmail = membreEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Membre [MembreCin=" + MembreCin + ", MembreNom=" + MembreNom + ", MembrePrenom=" + MembrePrenom
				+ ", MembreDateDeNaissance=" + MembreDateDeNaissance + ", MembreUsername=" + MembreUsername
				+ ", MembrePassword=" + MembrePassword + ", MembreLastLogin=" + MembreLastLogin + ", MembreIsActif="
				+ MembreIsActif + ", MembreEmail=" + MembreEmail + "]";
	}

}

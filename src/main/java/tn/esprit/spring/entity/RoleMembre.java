package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RoleMembre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long RoleId;
	
	private String RoleLibelle;
	private String RoleDescription;
	
	@OneToMany(mappedBy="MembreRole")
	private List<Membre> RoleListMembres;
	
	public RoleMembre() {
	}
	
	public Long getRoleId() {
		return RoleId;
	}
	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}
	public String getRoleLibelle() {
		return RoleLibelle;
	}
	public void setRoleLibelle(String roleLibelle) {
		RoleLibelle = roleLibelle;
	}
	public String getRoleDescription() {
		return RoleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RoleMembre [RoleId=" + RoleId + ", RoleLibelle=" + RoleLibelle + ", RoleDescription=" + RoleDescription
				+ "]";
	}

}

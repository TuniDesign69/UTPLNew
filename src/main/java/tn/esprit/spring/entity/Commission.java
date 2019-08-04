package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long CommissionId;
	private String CommissionLibelle;
	private String CommissionDescription;

	@OneToMany(mappedBy = "commission")
	private List<CommissionMembreAffectation> commissionMembreAffectations;
	
	public Commission() {
	}
	
	public Long getCommissionId() {
		return CommissionId;
	}
	public void setCommissionId(Long commissionId) {
		CommissionId = commissionId;
	}
	public String getCommissionLibelle() {
		return CommissionLibelle;
	}
	public void setCommissionLibelle(String commissionLibelle) {
		CommissionLibelle = commissionLibelle;
	}
	public String getCommissionDescription() {
		return CommissionDescription;
	}
	public void setCommissionDescription(String commissionDescription) {
		CommissionDescription = commissionDescription;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

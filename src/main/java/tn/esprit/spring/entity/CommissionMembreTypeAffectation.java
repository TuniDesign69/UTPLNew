package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommissionMembreTypeAffectation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long commissionMembreTypeAffectationId;
	
	private String commissionMembreTypeAffectationLibelle;
	private String commissionMembreTypeAffectationDescription;
	private int commissionMembreTypeAffectationUnique;
	
	public CommissionMembreTypeAffectation() {
	}
	
	public Long getCommissionMembreTypeAffectationId() {
		return commissionMembreTypeAffectationId;
	}
	public void setCommissionMembreTypeAffectationId(Long commissionMembreTypeAffectationId) {
		this.commissionMembreTypeAffectationId = commissionMembreTypeAffectationId;
	}
	public String getCommissionMembreTypeAffectationLibelle() {
		return commissionMembreTypeAffectationLibelle;
	}
	public void setCommissionMembreTypeAffectationLibelle(String commissionMembreTypeAffectationLibelle) {
		this.commissionMembreTypeAffectationLibelle = commissionMembreTypeAffectationLibelle;
	}
	public String getCommissionMembreTypeAffectationDescription() {
		return commissionMembreTypeAffectationDescription;
	}
	public void setCommissionMembreTypeAffectationDescription(String commissionMembreTypeAffectationDescription) {
		this.commissionMembreTypeAffectationDescription = commissionMembreTypeAffectationDescription;
	}
	public int getCommissionMembreTypeAffectationUnique() {
		return commissionMembreTypeAffectationUnique;
	}
	public void setCommissionMembreTypeAffectationUnique(int commissionMembreTypeAffectationUnique) {
		this.commissionMembreTypeAffectationUnique = commissionMembreTypeAffectationUnique;
	}
	
}

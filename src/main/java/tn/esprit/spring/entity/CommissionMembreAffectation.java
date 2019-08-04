package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommissionMembreAffectation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommissionMembreAffectationPK CommissionMembreAffectationPk;
	
	@Temporal(TemporalType.DATE)
	private Date commissionMembreAffectationDateAffection;
	
	@Temporal(TemporalType.DATE)
	private Date commissionMembreAffectationDateFinAffection;

	@ManyToOne
	@JoinColumn(name = "commissionId", referencedColumnName = "commissionId", insertable = false, updatable = false)
	private Commission commission;
	
	@ManyToOne
	@JoinColumn(name = "membreCin", referencedColumnName = "membreCin", insertable = false, updatable = false)
	private Membre membre;
	
	public CommissionMembreAffectationPK getCommissionMembreAffectationPk() {
		return CommissionMembreAffectationPk;
	}

	public void setCommissionMembreAffectationPk(CommissionMembreAffectationPK commissionMembreAffectationPk) {
		CommissionMembreAffectationPk = commissionMembreAffectationPk;
	}

	public Date getCommissionMembreAffectationDateAffection() {
		return commissionMembreAffectationDateAffection;
	}

	public void setCommissionMembreAffectationDateAffection(Date commissionMembreAffectationDateAffection) {
		this.commissionMembreAffectationDateAffection = commissionMembreAffectationDateAffection;
	}

	public Date getCommissionMembreAffectationDateFinAffection() {
		return commissionMembreAffectationDateFinAffection;
	}

	public void setCommissionMembreAffectationDateFinAffection(Date commissionMembreAffectationDateFinAffection) {
		this.commissionMembreAffectationDateFinAffection = commissionMembreAffectationDateFinAffection;
	}
	
	
}

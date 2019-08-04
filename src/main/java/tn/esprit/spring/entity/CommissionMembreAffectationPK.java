package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CommissionMembreAffectationPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long commissionId;
	private Long membreCin;

	public CommissionMembreAffectationPK() {
	}

	public Long getCommissionId() {
		return commissionId;
	}

	public void setCommissionId(Long commissionId) {
		this.commissionId = commissionId;
	}

	public Long getMembreCin() {
		return membreCin;
	}

	public void setMembreCin(Long membreCin) {
		this.membreCin = membreCin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commissionId == null) ? 0 : commissionId.hashCode());
		result = prime * result + ((membreCin == null) ? 0 : membreCin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommissionMembreAffectationPK other = (CommissionMembreAffectationPK) obj;
		if (commissionId == null) {
			if (other.commissionId != null)
				return false;
		} else if (!commissionId.equals(other.commissionId))
			return false;
		if (membreCin == null) {
			if (other.membreCin != null)
				return false;
		} else if (!membreCin.equals(other.membreCin))
			return false;
		return true;
	}

}

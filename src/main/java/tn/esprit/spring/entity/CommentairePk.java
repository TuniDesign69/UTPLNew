package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CommentairePk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long membreCin;
	private Long articleId;
	
	public CommentairePk() {
	}
	public Long getMembreCin() {
		return membreCin;
	}
	public void setMembreCin(Long membreCin) {
		this.membreCin = membreCin;
	}
	public Long getArticleId() {
		return articleId;
	}
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articleId == null) ? 0 : articleId.hashCode());
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
		CommentairePk other = (CommentairePk) obj;
		if (articleId == null) {
			if (other.articleId != null)
				return false;
		} else if (!articleId.equals(other.articleId))
			return false;
		if (membreCin == null) {
			if (other.membreCin != null)
				return false;
		} else if (!membreCin.equals(other.membreCin))
			return false;
		return true;
	}
	
}

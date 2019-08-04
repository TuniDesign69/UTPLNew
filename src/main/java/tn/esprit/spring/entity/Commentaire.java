package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CommentairePk CommentairePk;
	
	private String CommentaireLibelle;
	private String CommentaireContenu;
	private int CommentaireNote;
	private Date CommentaireDate;
	
	@ManyToOne
	@JoinColumn(name="MembreCin", referencedColumnName = "MembreCin", insertable = false, updatable = false)
	private Membre CommentaireMembre;
	
	@ManyToOne
	@JoinColumn(name="ArticleId", referencedColumnName = "ArticleId", insertable = false, updatable = false)
	private Article CommentaireArticle;
	
	public Commentaire() {
	}

	public String getCommentaireLibelle() {
		return CommentaireLibelle;
	}
	public void setCommentaireLibelle(String commentaireLibelle) {
		CommentaireLibelle = commentaireLibelle;
	}
	public String getCommentaireContenu() {
		return CommentaireContenu;
	}
	public void setCommentaireContenu(String commentaireContenu) {
		CommentaireContenu = commentaireContenu;
	}
	public int getCommentaireNote() {
		return CommentaireNote;
	}
	public void setCommentaireNote(int commentaireNote) {
		CommentaireNote = commentaireNote;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CommentairePk getCommentairePk() {
		return CommentairePk;
	}

	public void setCommentairePk(CommentairePk commentairePk) {
		CommentairePk = commentairePk;
	}

	public Membre getCommentaireMembre() {
		return CommentaireMembre;
	}

	public void setCommentaireMembre(Membre commentaireMembre) {
		CommentaireMembre = commentaireMembre;
	}

	public Article getCommentaireArticle() {
		return CommentaireArticle;
	}

	public void setCommentaireArticle(Article commentaireArticle) {
		CommentaireArticle = commentaireArticle;
	}

	public Date getCommentaireDate() {
		return CommentaireDate;
	}

	public void setCommentaireDate(Date commentaireDate) {
		CommentaireDate = commentaireDate;
	}
	
}

package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long CommentaireId;
	
	private String CommentaireLibelle;
	private String CommentaireContenu;
	private int CommentaireNote;
	
	@ManyToOne
	@JoinColumn(name="fk_commentaire_membre")
	private Membre CommentaireMembre;
	
	@ManyToOne
	@JoinColumn(name="fk_commentaire_article")
	private Article CommentaireArticle;
	
	public Commentaire() {
	}
	public Long getCommentaireId() {
		return CommentaireId;
	}
	public void setCommentaireId(Long commentaireId) {
		CommentaireId = commentaireId;
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
	@Override
	public String toString() {
		return "Commentaire [CommentaireId=" + CommentaireId + ", CommentaireLibelle=" + CommentaireLibelle
				+ ", CommentaireContenu=" + CommentaireContenu + ", CommentaireNote=" + CommentaireNote + "]";
	}
	
	
}

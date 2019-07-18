package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Forum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FroumId;

	private String ForumLibelle;
	private String ForumDescription;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Forum_Membres", 		
				joinColumns={@JoinColumn(name="ForumId")},
				inverseJoinColumns={@JoinColumn(name="MembreCin")})
	private List<Membre> ForumListMembres;

	@ManyToOne
	@JoinColumn(name="fk_forum_categorie")
	private Categorie ForumCategorie;
	
	@OneToMany(mappedBy="ArticleForum")
	private List<Article> ForumListArticles;
	
	public Forum() {
	}

	public Long getFroumId() {
		return FroumId;
	}

	public void setFroumId(Long froumId) {
		FroumId = froumId;
	}

	public String getForumLibelle() {
		return ForumLibelle;
	}

	public void setForumLibelle(String forumLibelle) {
		ForumLibelle = forumLibelle;
	}

	public String getForumDescription() {
		return ForumDescription;
	}

	public void setForumDescription(String forumDescription) {
		ForumDescription = forumDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Forum [FroumId=" + FroumId + ", ForumLibelle=" + ForumLibelle + ", ForumDescription=" + ForumDescription
				+ "]";
	}
}
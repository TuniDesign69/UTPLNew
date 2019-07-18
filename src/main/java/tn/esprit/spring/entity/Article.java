package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Article implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ArticleId;
	private String ArticleLibelle;
	private String ArticleDescription;
	private Date ArticleDateAjout;
	
	@ManyToOne
	@JoinColumn(name="fk_article_forum")
	private Forum ArticleForum;
	
	@OneToMany(mappedBy="CommentaireArticle")
	private List<Commentaire> ArticleListCommentaires;
	
	public Article() {
	}

	public Long getArticleId() {
		return ArticleId;
	}

	public void setArticleId(Long articleId) {
		ArticleId = articleId;
	}

	public String getArticleLibelle() {
		return ArticleLibelle;
	}

	public void setArticleLibelle(String articleLibelle) {
		ArticleLibelle = articleLibelle;
	}

	public String getArticleDescription() {
		return ArticleDescription;
	}

	public void setArticleDescription(String articleDescription) {
		ArticleDescription = articleDescription;
	}

	public Date getArticleDateAjout() {
		return ArticleDateAjout;
	}

	public void setArticleDateAjout(Date articleDateAjout) {
		ArticleDateAjout = articleDateAjout;
	}

	@Override
	public String toString() {
		return "Article [ArticleId=" + ArticleId + ", ArticleLibelle=" + ArticleLibelle + ", ArticleDescription="
				+ ArticleDescription + ", ArticleDateAjout=" + ArticleDateAjout + "]";
	}
	
}

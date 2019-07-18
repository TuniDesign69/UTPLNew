package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Article;

public interface IArticleService {

	List<Article> getAllArticles();

	Long addArticle(Article article);

	void deleteArticleById(Long id);

	void deleteArticle(Article article);

	void updateArticle(Article article, Long id);

	Article getArticle(Long id);

}

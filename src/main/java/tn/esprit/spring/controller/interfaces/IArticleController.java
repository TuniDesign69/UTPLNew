package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Article;

public interface IArticleController {

	List<Article> getAllArticles();

	ResponseEntity<Void> addArticle(Article article);

	ResponseEntity<Void> deleteArticleById(Long id);

	ResponseEntity<Void> updateArticle(Article article, Long id);

	ResponseEntity<Article> getArticle(Long id);
}

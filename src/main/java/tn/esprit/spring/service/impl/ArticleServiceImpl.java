package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Article;
import tn.esprit.spring.repository.ArticleRepository;
import tn.esprit.spring.service.interfaces.IArticleService;


@Service
public class ArticleServiceImpl implements IArticleService {

	@Autowired
	ArticleRepository articleRepository;

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return (List<Article>) articleRepository.findAll();
	}

	@Override
	public Long addArticle(Article article) {
		// TODO Auto-generated method stub
		try {
			articleRepository.save(article);
		} catch (Exception e) {
			// TODO: handle exception
			return -1L;
		}
		return article.getArticleId();
	}

	@Override
	public void deleteArticleById(Long id) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(id);
	}

	@Override
	public void deleteArticle(Article article) {
		// TODO Auto-generated method stub
		articleRepository.delete(article);
	}

	@Override
	public void updateArticle(Article article, Long id) {
		// TODO Auto-generated method stub

		Article existing = articleRepository.findById(id).get();
		if (existing != null) {
			article.setArticleId(id);
			existing = article;
			articleRepository.save(existing);
		}
	}

	@Override
	public Article getArticle(Long id) {
		// TODO Auto-generated method stub
		return articleRepository.findById(id).get();
	}

}

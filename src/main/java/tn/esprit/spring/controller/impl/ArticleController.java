package tn.esprit.spring.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.IArticleController;
import tn.esprit.spring.entity.Article;
import tn.esprit.spring.service.interfaces.IArticleService;

@RestController
@RequestMapping("/")
public class ArticleController implements IArticleController {

	@Autowired
	IArticleService articleService;

	@Override
	@RequestMapping(value = "/articles", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleService.getAllArticles();
	}

	@Override
	@RequestMapping(value = "/addarticle/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addArticle(@RequestBody Article article) {
		// TODO Auto-generated method stub
		Long id = articleService.addArticle(article);
		if(id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@RequestMapping(value = "/article/{articleId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteArticleById(@PathVariable("articleId") Long id) {
		// TODO Auto-generated method stub
		articleService.deleteArticleById(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@Override
	@RequestMapping(value = "/article/{articleId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateArticle(@RequestBody Article article, @PathVariable("articleId") Long id) {
		// TODO Auto-generated method stub
		articleService.updateArticle(article, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/article/{articleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Article> getArticle(@PathVariable("articleId") Long id) {
		// TODO Auto-generated method stub
		Article article = articleService.getArticle(id);
		if (article == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(article, HttpStatus.OK);
	}

}

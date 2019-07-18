package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Article;
@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>, JpaRepository<Article, Long> {

}

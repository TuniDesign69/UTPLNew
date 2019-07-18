package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Forum;
@Repository
public interface ForumRepository  extends CrudRepository<Forum, Long> {

}

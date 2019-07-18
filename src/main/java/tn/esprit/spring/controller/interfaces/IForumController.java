package tn.esprit.spring.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Forum;

public interface IForumController {

	List<Forum> getAllForums();

	ResponseEntity<Void> addForum(Forum forum);

	ResponseEntity<Void> deleteForumById(Long id);

	ResponseEntity<Void> updateForum(Forum forum, Long id);

	ResponseEntity<Forum> getForum(Long id);
}

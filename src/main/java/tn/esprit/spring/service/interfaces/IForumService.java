package tn.esprit.spring.service.interfaces;

import java.util.List;

import tn.esprit.spring.entity.Forum;

public interface IForumService {

	List<Forum> getAllForums();

	Long addForum(Forum forum);

	void deleteForumById(Long id);

	void deleteForum(Forum forum);

	void updateForum(Forum forum, Long id);

	Forum getForum(Long id);
}

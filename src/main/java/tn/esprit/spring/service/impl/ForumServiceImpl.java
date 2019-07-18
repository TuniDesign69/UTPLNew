package tn.esprit.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Forum;
import tn.esprit.spring.repository.ForumRepository;
import tn.esprit.spring.service.interfaces.IForumService;
@Service
public class ForumServiceImpl implements IForumService {

	@Autowired
	ForumRepository forumRepo;

	@Override
	public List<Forum> getAllForums() {
		// TODO Auto-generated method stub
		return (List<Forum>) forumRepo.findAll();
	}

	@Override
	public Long addForum(Forum forum) {
		// TODO Auto-generated method stub
		try {
			forumRepo.save(forum);
		} catch (Exception ex) {
			return -1L;
		}
		return forum.getFroumId();
	}

	@Override
	public void deleteForumById(Long id) {
		// TODO Auto-generated method stub
		forumRepo.deleteById(id);
	}

	@Override
	public void deleteForum(Forum forum) {
		// TODO Auto-generated method stub
		forumRepo.delete(forum);
	}

	@Override
	public void updateForum(Forum forum, Long id) {
		// TODO Auto-generated method stub
		Forum existing = forumRepo.findById(id).get();
		if (existing != null) {
			forum.setFroumId(id);
			existing = forum;
			forumRepo.save(existing);
		}
	}

	@Override
	public Forum getForum(Long id) {
		// TODO Auto-generated method stub
		return forumRepo.findById(id).get();
	}

}

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
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.controller.interfaces.IForumController;
import tn.esprit.spring.entity.Forum;
import tn.esprit.spring.service.interfaces.IForumService;

@RestController
@RequestMapping("/")
public class ForumController implements IForumController {

	@Autowired
	IForumService forumService;

	@Override
	@RequestMapping(value = "/forums", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Forum> getAllForums() {
		// TODO Auto-generated method stub
		return forumService.getAllForums();
	}

	@Override
	@RequestMapping(value = "/addforum/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addForum(@RequestBody Forum forum) {
		// TODO Auto-generated method stub
		Long id = forumService.addForum(forum);
		if (id == -1)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	@RequestMapping(value = "/forum/{forumId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteForumById(@PathVariable("forumId") Long id) {
		// TODO Auto-generated method stub
		forumService.deleteForumById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/forum/{forumId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateForum(@RequestBody Forum forum, @PathVariable("forumId") Long id) {
		// TODO Auto-generated method stub
		forumService.updateForum(forum, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/forum/{forumId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Forum> getForum(@PathVariable("forumId") Long id) {
		// TODO Auto-generated method stub
		Forum forum = forumService.getForum(id);
		if (forum == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(forum, HttpStatus.OK);
	}
}

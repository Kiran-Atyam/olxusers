package com.zensar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.OlxUser;
import com.zensar.db.OlxUserDAO;

@Service
public class OlxUserService {
@Autowired
OlxUserDAO dao;

public OlxUser addO1xUser(OlxUser olUser) {
	return dao.save(olUser);
	
}

public OlxUser findByOlxUser(String username) {
	return this.dao.findByUserName(username);
}

public OlxUser findById(int id) {
	Optional<OlxUser>optional=this.dao.findById(id);
	if(optional.isPresent())
		return optional.get();
	return null;
}
}

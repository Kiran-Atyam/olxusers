package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.OlxUser;

public interface OlxUserDAO extends JpaRepository<OlxUser, Integer> {
	OlxUser findByUserName(String userName);

}

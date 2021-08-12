package com.twokeys.twokeysapi.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.twokeysapi.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByLogin(String login);
	Page<User> findByNameLikeIgnoreCase(String name,Pageable pageable);
	List<User> findByNameLikeIgnoreCase(String firstName);
}



package com.twokeys.twokeysapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.twokeysapi.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
		
}


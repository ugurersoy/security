package com.ersoy.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ersoy.security.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>  {

	
	Optional<UserEntity> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}

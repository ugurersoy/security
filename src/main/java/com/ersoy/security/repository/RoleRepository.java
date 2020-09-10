package com.ersoy.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ersoy.security.enums.EnumRole;
import com.ersoy.security.model.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

	
	Optional<RoleEntity> findByName(EnumRole name);
}

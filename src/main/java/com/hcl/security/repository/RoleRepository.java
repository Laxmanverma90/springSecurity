package com.hcl.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.security.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}

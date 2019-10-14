package com.hcl.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

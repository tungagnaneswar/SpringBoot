package com.dockerboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dockerboot.entity.User;

@Repository
public interface UserAuthenticationRepository extends JpaRepository<User, Integer>{

	public Optional<User> findByUsername(String username);

}

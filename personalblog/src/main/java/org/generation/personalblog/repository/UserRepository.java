package org.generation.personalblog.repository;

import java.util.Optional;

import org.generation.personalblog.model.UserModel;
import org.generation.personalblog.model.UserLoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	public Optional<UserModel> findByUsuario(String string);

}
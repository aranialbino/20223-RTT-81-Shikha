package com.shikharani.onlinelearningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shikharani.onlinelearningplatform.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPassword(String email, String password);

}

package com.zoho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByEmail(String email);

}

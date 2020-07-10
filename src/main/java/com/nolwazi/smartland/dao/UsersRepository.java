package com.nolwazi.smartland.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nolwazi.smartland.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}

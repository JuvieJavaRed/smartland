package com.nolwazi.smartland.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nolwazi.smartland.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}

package com.nolwazi.smartland.dao;


import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nolwazi.smartland.entities.LandOwner;

@Repository
public interface LandOwnerRepository extends JpaRepository<LandOwner, Long> {
	List<LandOwner> findByDeedno(String deedno);
	
}

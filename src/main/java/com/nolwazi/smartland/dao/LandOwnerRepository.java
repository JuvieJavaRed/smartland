package com.nolwazi.smartland.dao;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nolwazi.smartland.entities.LandOwner;

@Repository
public interface LandOwnerRepository extends JpaRepository<LandOwner, Long> {
	
	
}

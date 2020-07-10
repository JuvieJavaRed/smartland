package com.nolwazi.smartland.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nolwazi.smartland.entities.Rates;


@Repository
public interface RatesRepository extends JpaRepository<Rates, Long> {
	
	

}

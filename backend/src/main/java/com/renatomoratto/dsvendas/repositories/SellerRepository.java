package com.renatomoratto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatomoratto.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}

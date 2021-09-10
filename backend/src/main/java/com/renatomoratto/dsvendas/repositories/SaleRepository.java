package com.renatomoratto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatomoratto.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}

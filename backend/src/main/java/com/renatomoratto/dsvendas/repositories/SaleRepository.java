package com.renatomoratto.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.renatomoratto.dsvendas.dto.SaleSuccessDTO;
import com.renatomoratto.dsvendas.dto.SaleSumDTO;
import com.renatomoratto.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.renatomoratto.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale as obj GROUP BY obj.seller")
	List<SaleSumDTO> amoutGroupedBySeller();
	
	@Query("SELECT new com.renatomoratto.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale as obj GROUP BY obj.seller")
	List<SaleSuccessDTO> sucessGroupedBySeller();
}

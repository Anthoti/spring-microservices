package com.intentory.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intentory.service.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory ,Long > {

	List<Inventory> findBySkuCodeIn(List<String> skuCode);

}

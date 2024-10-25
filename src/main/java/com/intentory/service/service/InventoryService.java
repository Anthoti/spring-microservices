package com.intentory.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intentory.service.dto.InventoryResponse;

@Service
public interface InventoryService {

	List<InventoryResponse> isInStock(List<String> skuCode);

}

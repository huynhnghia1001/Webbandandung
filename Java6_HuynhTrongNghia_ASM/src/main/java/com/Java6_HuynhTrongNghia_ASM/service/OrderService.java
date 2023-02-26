package com.Java6_HuynhTrongNghia_ASM.service;

import java.util.List;

import com.Java6_HuynhTrongNghia_ASM.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {

	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);



}

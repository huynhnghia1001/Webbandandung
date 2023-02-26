package com.Java6_HuynhTrongNghia_ASM.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Java6_HuynhTrongNghia_ASM.entity.Product;


public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	List<Product> timTheoTen(String name);

	List<Product> timTheoGia(Double price);

	Page<Product> findAvailable(Pageable pa);

}

package com.Java6_HuynhTrongNghia_ASM.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Java6_HuynhTrongNghia_ASM.DAO.ProductDAO;
import com.Java6_HuynhTrongNghia_ASM.entity.Product;
import com.Java6_HuynhTrongNghia_ASM.service.ProductService;


@Service
public class ProductServicelmpl implements ProductService {
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		pdao.deleteById(id);
	}

	@Override
	public List<Product> timTheoTen(String name) {
		return pdao.timTheoTen(name);
	}
	
	@Override
	public List<Product> timTheoGia(Double price) {
		return pdao.timTheogGia(price);
	}

	@Override
	public Page<Product> findAvailable(Pageable pa) {
		return pdao.findAvailable(pa);
	}
}

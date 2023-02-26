package com.Java6_HuynhTrongNghia_ASM.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Java6_HuynhTrongNghia_ASM.DAO.CategoryDAO;
import com.Java6_HuynhTrongNghia_ASM.entity.Category;
import com.Java6_HuynhTrongNghia_ASM.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}
	
	
}

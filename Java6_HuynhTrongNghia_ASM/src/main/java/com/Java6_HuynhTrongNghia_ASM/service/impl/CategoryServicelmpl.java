package com.Java6_HuynhTrongNghia_ASM.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.Java6_HuynhTrongNghia_ASM.DAO.CategoryDAO;
import com.Java6_HuynhTrongNghia_ASM.entity.Category;
import com.Java6_HuynhTrongNghia_ASM.service.CategoryService;


@Configuration
public class CategoryServicelmpl implements CategoryService {
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}
}

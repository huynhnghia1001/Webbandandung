package com.Java6_HuynhTrongNghia_ASM.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java6_HuynhTrongNghia_ASM.DAO.RoleDAO;
import com.Java6_HuynhTrongNghia_ASM.entity.Role;
import com.Java6_HuynhTrongNghia_ASM.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO dao;
	
	public List<Role>findAll(){
		return dao.findAll();
	}
}

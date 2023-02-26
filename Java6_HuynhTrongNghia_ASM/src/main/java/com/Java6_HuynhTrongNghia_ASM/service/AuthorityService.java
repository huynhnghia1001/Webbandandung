package com.Java6_HuynhTrongNghia_ASM.service;

import java.util.List;

import com.Java6_HuynhTrongNghia_ASM.entity.Authority;


public interface AuthorityService {
	public List<Authority> findAll();
	public Authority create(Authority auth);
	
	public void delete(Integer id);
	public List<Authority> findAuthoritiesOfAdministrators();
}	

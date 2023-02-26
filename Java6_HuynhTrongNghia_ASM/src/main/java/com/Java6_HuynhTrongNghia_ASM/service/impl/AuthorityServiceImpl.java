package com.Java6_HuynhTrongNghia_ASM.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java6_HuynhTrongNghia_ASM.DAO.AccountDAO;
import com.Java6_HuynhTrongNghia_ASM.DAO.AuthorityDAO;
import com.Java6_HuynhTrongNghia_ASM.entity.Account;
import com.Java6_HuynhTrongNghia_ASM.entity.Authority;
import com.Java6_HuynhTrongNghia_ASM.service.AuthorityService;



@Service
public class AuthorityServiceImpl implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;

	
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return dao.save(auth);
	}

	
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}
}

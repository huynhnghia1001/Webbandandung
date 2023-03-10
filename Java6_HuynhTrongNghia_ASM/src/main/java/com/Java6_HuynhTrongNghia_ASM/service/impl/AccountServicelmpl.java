package com.Java6_HuynhTrongNghia_ASM.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java6_HuynhTrongNghia_ASM.DAO.AccountDAO;
import com.Java6_HuynhTrongNghia_ASM.entity.Account;
import com.Java6_HuynhTrongNghia_ASM.entity.Product;
import com.Java6_HuynhTrongNghia_ASM.service.AccountService;



@Service
public class AccountServicelmpl implements AccountService{
	@Autowired
	AccountDAO adao;
	
	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return adao.findAll();
	}

	@Override
	public Account create(Account account) {
		return adao.save(account);
	}

	@Override
	public Account update(Account account) {
		return adao.save(account);
	}

	@Override
	public void delete(String username) {
		adao.deleteById(username);
	}

	@Override
	public List<Account> timTheoTen(String username) {
		return adao.timTheoTen(username);
	}
	
	

	
}

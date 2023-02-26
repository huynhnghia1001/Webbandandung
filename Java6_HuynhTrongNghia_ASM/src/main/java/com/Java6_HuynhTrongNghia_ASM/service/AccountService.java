package com.Java6_HuynhTrongNghia_ASM.service;

import java.util.List;

import com.Java6_HuynhTrongNghia_ASM.entity.Account;
import com.Java6_HuynhTrongNghia_ASM.entity.Product;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	public Account create(Account account);

	public Account update(Account account);

	void delete(String username);

	List<Account> timTheoTen(String username);
	
	


}

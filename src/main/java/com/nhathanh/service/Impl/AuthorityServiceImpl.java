package com.nhathanh.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhathanh.dao.AccountDAO;
import com.nhathanh.dao.AuthorityDAO;
import com.nhathanh.entity.Account;
import com.nhathanh.entity.Authority;
import com.nhathanh.service.AuthorityService;
@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAll() {
		return dao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return dao.save(auth); 
	} 

	@Override
	public void delete(Integer auth) {
		dao.deleteById(auth);
	} 

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account>accounts =acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

}

package com.nhathanh.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhathanh.dao.ProductDAO;
import com.nhathanh.entity.Product;
import com.nhathanh.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		return pdao.findAll();
	}

	@Override
	public Product findById(String id) {
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String id) {
		return pdao.findByCategoryId(id);
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
	public void delete(String id) {
		pdao.deleteById(id);
	}

	@Override
	public List<Product> findProduct(String request) {
		return pdao.findProduct(request); 
	}

	
}

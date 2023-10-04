package com.isaac.products.service;

import java.util.List;

import com.isaac.products.model.Product;

public interface ProductService {
	List<Product> searchProducts(String query);

    Product createProduct(Product product);

}

package com.isaac.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isaac.products.model.Product;
import com.isaac.products.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProductsSQL(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}

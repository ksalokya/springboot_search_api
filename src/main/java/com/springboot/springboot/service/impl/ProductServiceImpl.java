package com.springboot.springboot.service.impl;

import com.springboot.springboot.entity.Product;
import com.springboot.springboot.repository.ProductRepository;
import com.springboot.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }
}

package com.springboot.springboot.service;

import com.springboot.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> searchProducts(String query);
}

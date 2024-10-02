package com.likelion.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;

import java.util.Optional;

// 실제로 데이터를 가공 및 변환
public interface ProductService {
    public Product save(Product product);
    public Optional<Product> findById(Long id);
    public Product update(Long id, Product product);
    public void delete(Long id);
}

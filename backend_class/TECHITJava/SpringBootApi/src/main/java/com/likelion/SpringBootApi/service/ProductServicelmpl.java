package com.likelion.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public class ProductServicelmpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        try {
            return productRepository.save(
                    new Product(
                            product.getProductName(),
                            product.getPrice()
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product save(Product product) {

    }

    @Override
    public Optional<Product> findById(Long id) {
        try {
            Optional<Product> productData = productRepository.findById(id);
            if (productData.isPresent()) {
                return productData;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product update(Long id, Product product) {

    }

    @Override
    public void delete(Long id) {

    }
}

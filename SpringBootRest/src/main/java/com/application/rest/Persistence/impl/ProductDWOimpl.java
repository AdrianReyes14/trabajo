package com.application.rest.Persistence.impl;

import com.application.rest.Persistence.IProductDWO;
import com.application.rest.entities.Product;
import com.application.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDWOimpl implements IProductDWO {

    @Autowired
   private ProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByPrice(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductsByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);

    }
}

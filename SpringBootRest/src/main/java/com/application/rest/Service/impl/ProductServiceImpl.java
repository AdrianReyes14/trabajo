package com.application.rest.Service.impl;


import com.application.rest.Persistence.IProductDWO;
import com.application.rest.Service.IProductService;
import com.application.rest.entities.Product;
import com.application.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDWO productDWO;


    @Override
    public List<Product> findAll() {
        return productDWO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDWO.findById(id);
    }

    @Override
    public List<Product> findByPrice(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDWO.findByPrice(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
      productDWO.save(product);
    }

    @Override
    public void deleteById(Long id) {
     productDWO.deleteById(id);
    }
}

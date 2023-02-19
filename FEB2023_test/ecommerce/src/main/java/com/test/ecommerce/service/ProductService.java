package com.test.ecommerce.service;

import com.test.ecommerce.model.Product;
import com.test.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public int createProduct(Product product){
        productRepository.save(product);
        return product.getId();
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public int deleteByProductId(int id){
        productRepository.deleteById(id);
        return id;
    }
}

package com.test.ecommerce.controller;

import com.test.ecommerce.model.Product;
import com.test.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("create-product")
    public ResponseEntity<String> createProduct(@RequestBody Product product){
        int id = productService.createProduct(product);
        return new ResponseEntity<>("Product created with id : " + id , HttpStatus.CREATED);
    }

    @GetMapping("find-all")
    public List<Product> findAllProducts(){
        return productService.getAllProducts();

    }

    @DeleteMapping("delete-product-by-id/{productId}")
    public ResponseEntity<String> deleteProductById(@PathVariable int productId){
        productService.deleteByProductId(productId);
        return new ResponseEntity<>("Product Deleted with id : " + productId , HttpStatus.OK);
    }
}

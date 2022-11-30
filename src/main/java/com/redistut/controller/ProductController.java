package com.redistut.controller;

import com.redistut.entity.Product;
import com.redistut.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepo productRepo;
    @PostMapping("/product")
    public Product store(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @GetMapping("/product")
    public List<Product> index() {
        return productRepo.index();
    }
}

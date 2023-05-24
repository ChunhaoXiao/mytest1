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
public class TestGitController {
    @GetMapping("/git")
    public String index() {
        return "sucesss~~";
    }
}
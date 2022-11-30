package com.redistut.repository;

import com.redistut.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo {

    @Autowired
    private RedisTemplate redisTemplate;

    public Product save(Product product) {
        redisTemplate.opsForHash().put("Product",product.getId(),product);
        return product;
    }

    public List<Product> index() {
        return redisTemplate.opsForHash().values("Product");
    }

    public Product find(int id) {
        return (Product) redisTemplate.opsForHash().get("Product",id);
    }

    public Long delete(int id) {
        return redisTemplate.opsForHash().delete("Product", id);
    }
}

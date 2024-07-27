package com.myworld.searchdemo.repository;

import com.myworld.searchdemo.entity.Product;
import com.myworld.searchdemo.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductByProductNameContains(String productName);
    List<Product> findProductByPrice(Double productPrice);

    List<Product> findAll(Sort sort);
    List<Product> findProductByPriceAndProductNameContains(Double productPrice, String productName);
}

package com.myworld.searchdemo.service;

import com.myworld.searchdemo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Object getAllProducts(String productName, Double productPrice, Integer sortName,Integer sortPrice);

}

package com.myworld.searchdemo.service;


import com.myworld.searchdemo.entity.Product;
import com.myworld.searchdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts(String productName, Double productPrice, Integer sortName,Integer sortPrice) {

        Sort sortAllPrice = Sort.by(Sort.Direction.DESC, "price");
        List<Product> productList;
        if(!productName.isEmpty() && (productPrice != 0)){

            productList =  productRepository.findProductByPriceAndProductNameContains(productPrice,productName);
        }
        else if(!productName.isEmpty()){
            productList =  productRepository.findProductByProductNameContains(productName);
            }

       else if(productPrice != 0){
            productList = productRepository.findProductByPrice(productPrice);
        }
       else {
            productList = productRepository.findAll(sortAllPrice);
       }
        if(sortName == 2 && sortPrice == 0){
            productList.sort(Comparator.comparing(Product::getPrice));
        }
        else if (sortName == 2 && sortPrice == 1) {
            productList.sort(Comparator.comparing(Product::getPrice).reversed());
        }
        else if (sortPrice == 2 && sortName == 0) {
            productList.sort(Comparator.comparing(Product::getProductName));
        }
        else if (sortPrice == 2 && sortName == 1) {
            productList.sort(Comparator.comparing(Product::getProductName).reversed());
        }

        return  productList;

    }

}

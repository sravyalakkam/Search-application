package com.myworld.searchdemo.controller;
import com.myworld.searchdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public Object getAllProducts(@RequestParam(required = false,defaultValue = "") String productName,
                                 @RequestParam(required = false,defaultValue = "0") Double productPrice,
                                 @RequestParam(required = false,defaultValue = "2") Integer sortName,
                                 @RequestParam(required = false,defaultValue = "2") Integer sortPrice) {
        return productService.getAllProducts(productName, productPrice, sortName, sortPrice);
    }

}

package com.myworld.searchdemo;

import com.myworld.searchdemo.entity.Product;
import com.myworld.searchdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class SearchDemoAppApplication   {

	public static void main(String[] args) {SpringApplication.run(SearchDemoAppApplication.class, args);
	}


}

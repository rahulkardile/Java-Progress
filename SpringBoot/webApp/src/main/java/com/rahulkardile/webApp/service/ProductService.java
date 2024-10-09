package com.rahulkardile.webApp.service;

import com.rahulkardile.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> product = Arrays.asList(
            new Product(101, "Iphone 6s", 50000),
            new Product(102, "Lenovo Think Pad 6", 65000),
            new Product(103, "Redmi Note 7 Pro", 61000)
            );

    public List<Product> getProduct(){
        return product;
    }

    }

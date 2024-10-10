package com.rahulkardile.webApp.controller;

import com.rahulkardile.webApp.model.Product;
import com.rahulkardile.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> Product(){
        return service.getProduct();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        System.out.println(product);
        service.addProduct(product);

        return "Product Added";
    }

    @PostMapping("/addManyProducts")
    public String addMultipleProduct(){
      int totalProductAdded = service.addMultipleProduct();
        return "Added " + totalProductAdded;
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }

}

package com.ankit.productservicefeb25.controllers;

import com.ankit.productservicefeb25.exceptions.ProductNotFoundException;
import com.ankit.productservicefeb25.models.Product;
import com.ankit.productservicefeb25.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
        ResponseEntity<Product> responseEntity = null;
//        try{
//            Product product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product,HttpStatus.OK);
//        }
//        catch (ProductNotFoundException e){
//            System.out.println(e.getMessage());
//            responseEntity = new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
//        }
        //        responseEntity = new ResponseEntity<>(product,HttpStatus.OK);
        return productService.getProductById(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product) {
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {

    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }
}

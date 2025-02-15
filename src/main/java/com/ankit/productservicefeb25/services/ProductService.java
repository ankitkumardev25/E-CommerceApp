package com.ankit.productservicefeb25.services;

import com.ankit.productservicefeb25.exceptions.ProductNotFoundException;
import com.ankit.productservicefeb25.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId) throws ProductNotFoundException;
    List<Product> getAllProducts();

}

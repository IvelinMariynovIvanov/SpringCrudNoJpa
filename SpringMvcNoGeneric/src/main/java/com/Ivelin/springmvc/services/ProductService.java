package com.Ivelin.springmvc.services;
import com.Ivelin.springmvc.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(int id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(int id);
}

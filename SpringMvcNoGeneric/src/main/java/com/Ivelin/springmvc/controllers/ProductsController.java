package com.Ivelin.springmvc.controllers;

import com.Ivelin.springmvc.domain.Product;
import com.Ivelin.springmvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model) {

        model.addAttribute("products", productService.getAllProducts());

        return "products";
    }

    @RequestMapping("/product/{id}")
    public  String getProduct(@PathVariable int id, Model model) {

        model.addAttribute("product", productService.getProductById(id));

        return "Product";
    }

    @RequestMapping("/product/delete/{id}")
    public  String deleteProduct(@PathVariable int id) {

        this.productService.deleteProduct(id);

        return "redirect:/products";
    }

    @RequestMapping("/product/edit/{id}")
    public  String editPriduct(@PathVariable int id, Model model) {

        model.addAttribute("product", productService.getProductById(id));

        return  "ProductForm";
    }

    @RequestMapping("/product/new")
    public  String newProduct(Model model) {

        model.addAttribute("product", new Product());

        return ("ProductForm");
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveOrUpdate(Product product) {

        Product savedProduct = productService.saveOrUpdateProduct(product);

        return  "redirect:/product/" + savedProduct.getId();
    }
}

package com.herbeacha.app.controller;

import com.herbeacha.app.model.Product;
import com.herbeacha.app.model.dto.ProductDto;
import com.herbeacha.app.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete")
    public void deleteProduct(Product product) {
        productService.deleteProduct(product);
    }

    @PostMapping("/create")
    public void createProduct(ProductDto productDto) {
        productService.createProduct(productDto);
    }

    @PutMapping("update")
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

}

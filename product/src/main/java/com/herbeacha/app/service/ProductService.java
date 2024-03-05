package com.herbeacha.app.service;

import com.herbeacha.app.data.ProductRepository;
import com.herbeacha.app.model.Category;
import com.herbeacha.app.model.Product;
import com.herbeacha.app.model.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(String name, Type type, String description, Category category) {
        Product product = new Product();
        product.setName(name);
        product.setType(type);
        product.setDescription(description);
        product.setCategory(category);
        productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public void updateProduct(Product product) {
        Product existingProduct = productRepository.findById(String.valueOf(product.getId()))
                .orElseThrow(() -> new IllegalArgumentException("Produit non trouvé"));
        existingProduct.setName(product.getName());
        existingProduct.setType(product.getType());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setCategory(product.getCategory());
        productRepository.save(existingProduct);
    }

    public Integer countProductsByCategory(Category category) {
        return productRepository.countByCategory(category);
    }
}
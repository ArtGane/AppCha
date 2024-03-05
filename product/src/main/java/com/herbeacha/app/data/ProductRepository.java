package com.herbeacha.app.data;

import com.herbeacha.app.model.Category;
import com.herbeacha.app.model.Product;
import com.herbeacha.app.model.Type;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByCategory(Category category);
    List<Product> findByType(Type type);

    Integer countByCategory(Category category);
}
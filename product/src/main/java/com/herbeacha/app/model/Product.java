package com.herbeacha.app.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class Product {

    @Id
    private Long id;
    private String name;
    //Les différents types sont
    //    TISANE,
    //    ONGUENT,
    //    ANIMALIER,
    //    SMOKE
    private Type type;
    private String description;

    //Les différentes catégories sont
    //    DIGESTION,
    //    STRESS,
    //    DETOX,
    //    BOOST,
    //    ARTICULATION,
    //    CIRCULATION_VEINES,
    //    ENCEINTES,
    //    SOMMEIL,
    //    EDITION_LIMITE,
    //    MENSTRUATIONS,
    //    PERSONNALISE
    private Category category;

    public Product(String name, Type type, String description, Category category) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.category = category;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
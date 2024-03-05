package com.herbeacha.app.model.dto;

import com.herbeacha.app.model.Category;
import com.herbeacha.app.model.Type;

public class ProductDto {

    String name;
    Type type;
    String description;
    Category category;

    public ProductDto() {
    }

    public ProductDto(String name, Type type, String description, Category category) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.category = category;
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

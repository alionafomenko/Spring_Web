package com.cosmo.cats.api.domain;


import java.math.BigDecimal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder(toBuilder = true)
public class Product {
   private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private Category category;

    public Product(Long id, String name, String description, BigDecimal price, Integer stockQuantity, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }
}

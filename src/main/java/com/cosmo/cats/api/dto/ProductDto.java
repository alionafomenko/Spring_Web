package com.cosmo.cats.api.dto;

import com.cosmo.cats.api.domain.Category;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductDto {
  Long id;
  String name;
  String description;
  BigDecimal price;
  Integer stockQuantity;
  Category category;
}

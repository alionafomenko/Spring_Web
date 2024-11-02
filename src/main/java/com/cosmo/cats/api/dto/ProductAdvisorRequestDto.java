package com.cosmo.cats.api.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductAdvisorRequestDto {
  String name;
  String description;
  BigDecimal price;
}

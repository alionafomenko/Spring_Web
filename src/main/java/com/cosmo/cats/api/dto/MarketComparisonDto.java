package com.cosmo.cats.api.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Setter
@Getter
@Builder
@Jacksonized
public class MarketComparisonDto {
  private String market;
  private BigDecimal price;
  private BigDecimal priceDifference;

  
}

package com.cosmo.cats.api.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(toBuilder = true)
public class Order {

  private Product product;
  private Integer quantity;

  public Order(Product product, Integer quantity) {
    this.product = product;
    this.quantity = quantity;
  }
}

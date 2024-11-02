package com.cosmo.cats.api.domain;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder(toBuilder = true)
public class Order {
  private Long id;
  private String cartId;
  private BigDecimal totalPrice;
  private List<OrderEntry> entries;

  public Order(Long id, String cartId, BigDecimal totalPrice, List<OrderEntry> entries) {
    this.id = id;
    this.cartId = cartId;
    this.totalPrice = totalPrice;
    this.entries = entries;
  }
}

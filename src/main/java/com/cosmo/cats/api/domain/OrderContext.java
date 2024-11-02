package com.cosmo.cats.api.domain;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder(toBuilder = true)
public class OrderContext {
    private String cartId;
    private List<OrderEntry> entries;
    private BigDecimal totalPrice;

    public OrderContext(String cartId, List<OrderEntry> entries, BigDecimal totalPrice) {
        this.cartId = cartId;
        this.entries = entries;
        this.totalPrice = totalPrice;
    }
}

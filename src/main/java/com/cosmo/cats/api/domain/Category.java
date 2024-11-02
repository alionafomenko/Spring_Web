package com.cosmo.cats.api.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder(toBuilder = true)
public class Category {
  private Long id;
  private String name;

  public Category(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}

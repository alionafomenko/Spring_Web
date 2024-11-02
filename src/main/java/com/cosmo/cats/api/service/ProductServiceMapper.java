package com.cosmo.cats.api.service;

import com.cosmo.cats.api.domain.Product;
import com.cosmo.cats.api.dto.ProductAdvisorRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductServiceMapper {

  ProductAdvisorRequestDto toProductAdvisorRequestDto(Product product);
}

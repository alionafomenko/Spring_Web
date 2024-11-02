package com.cosmo.cats.api.service;

import com.cosmo.cats.api.domain.Product;
import com.cosmo.cats.api.dto.ProductAdvisorResponseDto;

public interface ProductAdvisorService {

  ProductAdvisorResponseDto getProductPriceAdvice(Product product);
}

package com.cosmo.cats.api.mapper;

import com.cosmo.cats.api.domain.Product;
import com.cosmo.cats.api.dto.ProductCreationDto;
import com.cosmo.cats.api.dto.ProductDto;
import com.cosmo.cats.api.dto.ProductUpdateDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {

    List<ProductDto> toProductDto(List<Product> products);

    ProductDto toProductDto(Product product);

    Product toProduct(ProductCreationDto productDto);
    Product toProduct(ProductUpdateDto productDto);

}

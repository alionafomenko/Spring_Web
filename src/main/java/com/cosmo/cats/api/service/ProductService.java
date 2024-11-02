package com.cosmo.cats.api.service;

import com.cosmo.cats.api.domain.Product;

import java.util.List;

public interface ProductService {
  List<Product> getProducts();
  Product getProduct(Long id);
  Product createProduct(Product product, Long categoryId);
  Product updateProduct(Long id, Product product, Long categoryId);
  void deleteProduct(Long id);


}

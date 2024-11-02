package com.cosmo.cats.api.data;

import com.cosmo.cats.api.domain.Category;
import com.cosmo.cats.api.domain.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> products = new ArrayList<>(buildAllProductsMock());


    @Override
    public Optional<Product> getById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Optional<Product> update(Long id, Product updatedProduct) {
        delete(id);
        products.add(updatedProduct);
        return Optional.of(updatedProduct);
    }

    @Override
    public void delete(Long id) {
        var toBeDeleted = products.stream().filter(temp -> temp.getId().equals(id)).findFirst();
        if (toBeDeleted.isEmpty()) {
            return;
        }
        products.remove(toBeDeleted.get());
    }

    @Override
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
    public void resetRepository() {
        products.clear();
        products.addAll(buildAllProductsMock());
    }

    private List<Product> buildAllProductsMock() {
        return List.of(
                Product.builder()
                        .id(1L)
                        .name("Mars Rover Model")
                        .description("A detailed replica of the Mars exploration rover.")
                        .price(BigDecimal.valueOf(399.99))
                        .stockQuantity(25)
                        .category(Category.builder().id(1L).name("Space Models").build())
                        .build(),
                Product.builder()
                        .id(2L)
                        .name("Galactic Telescope")
                        .description("A powerful telescope for stargazing and galaxy exploration.")
                        .price(BigDecimal.valueOf(799.99))
                        .stockQuantity(15)
                        .category(Category.builder().id(2L).name("Space Exploration Tools").build())
                        .build(),
                Product.builder()
                        .id(3L)
                        .name("Alien Language Translator")
                        .description("A device that translates common extraterrestrial languages.")
                        .price(BigDecimal.valueOf(499.99))
                        .stockQuantity(40)
                        .category(Category.builder().id(3L).name("Communication Devices").build())
                        .build(),
                Product.builder()
                        .id(4L)
                        .name("Quantum Battery")
                        .description("A long-lasting battery designed for space expeditions.")
                        .price(BigDecimal.valueOf(299.99))
                        .stockQuantity(75)
                        .category(Category.builder().id(4L).name("Power Supplies").build())
                        .build()
        );
    }

}

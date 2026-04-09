package com.edomocar.springboot.di.app.springboot_di.repositories;

import java.util.List;
import com.edomocar.springboot.di.app.springboot_di.models.Product;
import java.util.Arrays;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Smartphone", 499.99),
            new Product(3L, "Tablet", 299.99)
        );
    }

    // Retorna la lista de productos
    public List<Product> findAll() {
        return data;
    }

    // Retorna un producto por su ID
    public Product findById(Long id) {
        return data.stream()
                   .filter(product -> product.getId().equals(id))
                   .findFirst()
                   .orElse(null);
    }
}

package com.edomocar.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;
import com.edomocar.springboot.di.app.springboot_di.repositories.ProductRepository;
import com.edomocar.springboot.di.app.springboot_di.models.Product;

public class ProductService {
    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double precio = p.getPrecio() * 1.25d; // Aplicar un aumento del 25% al precio
            p.setPrecio(precio.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

}

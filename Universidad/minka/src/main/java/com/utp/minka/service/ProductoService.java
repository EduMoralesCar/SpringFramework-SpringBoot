package com.utp.minka.service;

import com.utp.minka.persistence.entity.Producto;
import com.utp.minka.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }
}

package com.utp.minka.controller;

import com.utp.minka.persistence.entity.Producto;
import com.utp.minka.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> save(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoService.save(producto), HttpStatus.CREATED);
    }
}

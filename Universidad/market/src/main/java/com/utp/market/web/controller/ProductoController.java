package com.utp.market.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.market.domain.service.ProductoService;
import com.utp.market.persistence.entity.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	private final ProductoService productoService;

	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping
	public List<Producto> listar() {
		return productoService.listar();
	}

	@PostMapping
	public Producto registrar(@RequestBody Producto producto) {
		return productoService.registrar(producto);
	}
}

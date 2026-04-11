package com.utp.market.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.utp.market.domain.repository.ProductoRepository;
import com.utp.market.persistence.entity.Producto;

@Service
public class ProductoService {

	private final ProductoRepository productoRepository;

	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	public List<Producto> listar() {
		return productoRepository.findAll();
	}

	public Producto registrar(Producto producto) {
		return productoRepository.save(producto);
	}
}

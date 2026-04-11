package com.utp.market.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.market.domain.service.CategoriaService;
import com.utp.market.persistence.entity.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	private final CategoriaService categoriaService;

	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	@GetMapping
	public List<Categoria> listar() {
		return categoriaService.listar();
	}

	@PostMapping
	public Categoria registrar(@RequestBody Categoria categoria) {
		return categoriaService.registrar(categoria);
	}
}

package com.utp.market.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.utp.market.domain.repository.CategoriaRepository;
import com.utp.market.persistence.entity.Categoria;

@Service
public class CategoriaService {

	private final CategoriaRepository categoriaRepository;

	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}

	public Categoria registrar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}

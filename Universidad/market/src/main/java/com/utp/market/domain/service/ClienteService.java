package com.utp.market.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.utp.market.domain.repository.ClienteRepository;
import com.utp.market.persistence.entity.Cliente;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	public Cliente registrar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}

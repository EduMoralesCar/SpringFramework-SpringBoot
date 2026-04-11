package com.utp.market.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.market.domain.service.ClienteService;
import com.utp.market.persistence.entity.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<Cliente> listar() {
		return clienteService.listar();
	}

	@PostMapping
	public Cliente registrar(@RequestBody Cliente cliente) {
		return clienteService.registrar(cliente);
	}
}

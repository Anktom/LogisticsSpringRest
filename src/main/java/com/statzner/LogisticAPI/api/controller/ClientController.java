package com.statzner.LogisticAPI.api.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.statzner.LogisticAPI.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/clientes")
	public List<Client> listar() {
		
		Client client1 = new Client();
		client1.setId(1L);
		client1.setNome("João");
		client1.setTelefone("24 992700705");
		client1.setEmail("joão@gamail.com");
		
		Client client2 = new Client();
		client2.setId(2L);
		client2.setNome("Maria");
		client2.setTelefone("24 992700705");
		client2.setEmail("Maria@gamail.com");
		
		Client client3 = new Client();
		client3.setId(3L);
		client3.setNome("Jorge");
		client3.setTelefone("24 992700705");
		client3.setEmail("Jorge@gamail.com");
		
		
		
		return Arrays.asList(client1,client2,client3);
	}

}

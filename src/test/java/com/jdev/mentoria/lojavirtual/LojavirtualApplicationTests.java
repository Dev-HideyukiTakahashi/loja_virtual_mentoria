package com.jdev.mentoria.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jdev.mentoria.lojavirtual.controller.AcessoController;
import com.jdev.mentoria.lojavirtual.model.Acesso;

@SpringBootTest
class LojavirtualApplicationTests {

	@Autowired
	private AcessoController acessoController;

	@Test
	void testeCadastro() {
		Acesso acesso = new Acesso("ROLE_ADMIN");
		acessoController.salvar(acesso);
	}
}

package com.jdev.mentoria.lojavirtual;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	void testeCadastroAcesso() {
		Acesso acesso = new Acesso("ROLE_USUARIO");
		acesso = acessoController.salvar(acesso).getBody();

		assertEquals(true, acesso.getId() > 0);
		assertEquals("ROLE_USUARIO", acesso.getDescricao());
	}
}

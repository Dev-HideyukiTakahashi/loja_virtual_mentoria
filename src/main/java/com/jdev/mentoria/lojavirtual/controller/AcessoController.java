package com.jdev.mentoria.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdev.mentoria.lojavirtual.model.Acesso;
import com.jdev.mentoria.lojavirtual.service.AcessoService;

@RestController
public class AcessoController {

  @Autowired
  private AcessoService acessoService;

  @PostMapping
  public Acesso salvar(@RequestBody Acesso acesso) {
    return acessoService.save(acesso);
  }

}

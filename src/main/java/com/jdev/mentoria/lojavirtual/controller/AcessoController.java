package com.jdev.mentoria.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdev.mentoria.lojavirtual.model.Acesso;
import com.jdev.mentoria.lojavirtual.service.AcessoService;

@RestController
@RequestMapping("/acessos")
public class AcessoController {

  @Autowired
  private AcessoService acessoService;

  @PostMapping
  public ResponseEntity<Acesso> salvar(@RequestBody Acesso obj) {
    Acesso acesso = acessoService.save(obj);
    return ResponseEntity.status(HttpStatus.CREATED).body(acesso);
  }

}

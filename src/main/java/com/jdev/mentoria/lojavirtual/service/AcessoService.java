package com.jdev.mentoria.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdev.mentoria.lojavirtual.model.Acesso;
import com.jdev.mentoria.lojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {

  @Autowired
  private AcessoRepository acessoRepository;

  public Acesso save(Acesso acesso) {
    return acessoRepository.save(acesso);
  }

  public void deletar(Long id) {
    acessoRepository.deleteById(id);
  }

}

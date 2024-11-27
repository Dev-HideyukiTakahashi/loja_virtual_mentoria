package com.jdev.mentoria.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca_produto")
public class MarcaProduto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nomeDesc;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNomeDesc() {
    return nomeDesc;
  }

  public void setNomeDesc(String nomeDesc) {
    this.nomeDesc = nomeDesc;
  }

}

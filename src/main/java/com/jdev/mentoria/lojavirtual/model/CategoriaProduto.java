package com.jdev.mentoria.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_produto")
public class CategoriaProduto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  String nomeDesc;

  public CategoriaProduto() {
  }

  public CategoriaProduto(String nomeDesc) {
    this.nomeDesc = nomeDesc;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CategoriaProduto other = (CategoriaProduto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

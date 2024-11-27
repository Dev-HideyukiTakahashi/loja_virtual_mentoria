package com.jdev.mentoria.lojavirtual.model;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Acesso implements GrantedAuthority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao; // Acesso ex: ROLE_ADMIN, ROLE_USER, ROLE_SECRETARIO . . .

  public Acesso() {
  }

  public Acesso(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String getAuthority() {

    return descricao;
  }

  public Long getId() {
    return id;
  }

  public String getDescricao() {
    return descricao;
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
    Acesso other = (Acesso) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

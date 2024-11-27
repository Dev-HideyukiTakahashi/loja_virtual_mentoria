package com.jdev.mentoria.lojavirtual.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class PessoaFisica extends Pessoa {

  @Column(nullable = false)
  private String cpf;

  @Temporal(TemporalType.DATE)
  private Date dataNascimento;

  public PessoaFisica() {
  }

  public PessoaFisica(String cpf, Date dataNascimento) {
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

}

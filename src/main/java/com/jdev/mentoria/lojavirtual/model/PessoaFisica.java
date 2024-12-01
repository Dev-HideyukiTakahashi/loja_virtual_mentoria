package com.jdev.mentoria.lojavirtual.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

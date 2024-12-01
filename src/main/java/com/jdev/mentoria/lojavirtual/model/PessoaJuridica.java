package com.jdev.mentoria.lojavirtual.model;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

  private String cnpj;
  private String inscricaoEstadual;
  private String inscricaoMunicipal;
  private String nomeFantasia;
  private String razaoSocial;
  private String categoria;

  public PessoaJuridica() {
  }

  public PessoaJuridica(String cnpj, String inscricaoEstadual, String inscricaoMunicipal, String nomeFantasia,
      String razaoSocial, String categoria) {
    this.cnpj = cnpj;
    this.inscricaoEstadual = inscricaoEstadual;
    this.inscricaoMunicipal = inscricaoMunicipal;
    this.nomeFantasia = nomeFantasia;
    this.razaoSocial = razaoSocial;
    this.categoria = categoria;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  public String getInscricaoMunicipal() {
    return inscricaoMunicipal;
  }

  public void setInscricaoMunicipal(String inscricaoMunicipal) {
    this.inscricaoMunicipal = inscricaoMunicipal;
  }

  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

}

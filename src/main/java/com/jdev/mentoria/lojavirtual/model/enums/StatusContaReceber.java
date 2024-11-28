package com.jdev.mentoria.lojavirtual.model.enums;

public enum StatusContaReceber {

  COBRANCA("Pagar"),
  VENCIDA("Vencida"),
  ABERTA("Aberta"),
  QUITADA("Quitada");

  private String descricao;

  private StatusContaReceber(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return this.descricao;
  }
}

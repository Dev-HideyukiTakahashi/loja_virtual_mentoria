package com.jdev.mentoria.lojavirtual.model.enums;

public enum StatusContaPagar {

  COBRANCA("Pagar"),
  VENCIDA("Vencida"),
  ABERTA("Aberta"),
  QUITADA("Quitada"),
  NEGOCIADA("Negociada");

  private String descricao;

  private StatusContaPagar(String descricao) {
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

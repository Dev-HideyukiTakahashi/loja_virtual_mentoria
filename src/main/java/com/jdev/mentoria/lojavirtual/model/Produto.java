package com.jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  private String tipoUnidade;
  private String nome;
  private Boolean ativo = true;

  @Column(columnDefinition = "TEXT")
  private String descricao;

  /* nota item nota produto - associar */

  private Double peso;
  private Double largura;
  private Double altura;
  private Double profundidade;
  private BigDecimal valorVenda = BigDecimal.ZERO;
  private Integer qtdEstoque = 0;
  private Integer qtdAlertaEstoque = 0;
  private String linkYoutube;
  private Boolean alertaQtdEstoque = false;
  private Integer qtdCliqueProduto = 0;

  public Produto() {
  }

  public Produto(String tipoUnidade, String nome, Boolean ativo, String descricao, Double peso, Double largura,
      Double altura, Double profundidade, BigDecimal valorVenda, Integer qtdEstoque, Integer qtdAlertaEstoque,
      String linkYoutube, Boolean alertaQtdEstoque, Integer qtdCliqueProduto) {
    this.tipoUnidade = tipoUnidade;
    this.nome = nome;
    this.ativo = ativo;
    this.descricao = descricao;
    this.peso = peso;
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
    this.valorVenda = valorVenda;
    this.qtdEstoque = qtdEstoque;
    this.qtdAlertaEstoque = qtdAlertaEstoque;
    this.linkYoutube = linkYoutube;
    this.alertaQtdEstoque = alertaQtdEstoque;
    this.qtdCliqueProduto = qtdCliqueProduto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTipoUnidade() {
    return tipoUnidade;
  }

  public void setTipoUnidade(String tipoUnidade) {
    this.tipoUnidade = tipoUnidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  public Double getLargura() {
    return largura;
  }

  public void setLargura(Double largura) {
    this.largura = largura;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public Double getProfundidade() {
    return profundidade;
  }

  public void setProfundidade(Double profundidade) {
    this.profundidade = profundidade;
  }

  public BigDecimal getValorVenda() {
    return valorVenda;
  }

  public void setValorVenda(BigDecimal valorVenda) {
    this.valorVenda = valorVenda;
  }

  public Integer getQtdEstoque() {
    return qtdEstoque;
  }

  public void setQtdEstoque(Integer qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }

  public Integer getQtdAlertaEstoque() {
    return qtdAlertaEstoque;
  }

  public void setQtdAlertaEstoque(Integer qtdAlertaEstoque) {
    this.qtdAlertaEstoque = qtdAlertaEstoque;
  }

  public String getLinkYoutube() {
    return linkYoutube;
  }

  public void setLinkYoutube(String linkYoutube) {
    this.linkYoutube = linkYoutube;
  }

  public Boolean getAlertaQtdEstoque() {
    return alertaQtdEstoque;
  }

  public void setAlertaQtdEstoque(Boolean alertaQtdEstoque) {
    this.alertaQtdEstoque = alertaQtdEstoque;
  }

  public Integer getQtdCliqueProduto() {
    return qtdCliqueProduto;
  }

  public void setQtdCliqueProduto(Integer qtdCliqueProduto) {
    this.qtdCliqueProduto = qtdCliqueProduto;
  }

  public Boolean getAtivo() {
    return ativo;
  }

  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
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
    Produto other = (Produto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

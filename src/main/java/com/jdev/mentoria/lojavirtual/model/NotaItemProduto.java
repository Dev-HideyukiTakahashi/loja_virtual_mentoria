package com.jdev.mentoria.lojavirtual.model;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NotaItemProduto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Double quantidade;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fisca_compra_fk"))
  private NotaFiscalCompra notaFiscalCompra;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
  private Produto produto;

  public NotaItemProduto() {
  }

  public NotaItemProduto(Double quantidade, NotaFiscalCompra notaFiscalCompra, Produto produto) {
    this.quantidade = quantidade;
    this.notaFiscalCompra = notaFiscalCompra;
    this.produto = produto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Double quantidade) {
    this.quantidade = quantidade;
  }

  public NotaFiscalCompra getNotaFiscalCompra() {
    return notaFiscalCompra;
  }

  public void setNotaFiscalCompra(NotaFiscalCompra notaFiscalCompra) {
    this.notaFiscalCompra = notaFiscalCompra;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
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
    NotaItemProduto other = (NotaItemProduto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

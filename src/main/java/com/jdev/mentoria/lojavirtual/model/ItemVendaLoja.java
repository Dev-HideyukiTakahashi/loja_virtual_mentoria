package com.jdev.mentoria.lojavirtual.model;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemVendaLoja {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Double quantidade;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
  private Produto produto;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "venda_compra_loja_virtual_fk"))
  private VendaCompraLojaVirtual vendaCompraLojaVirtual;

  public ItemVendaLoja() {
  }

  public ItemVendaLoja(Double quantidade, Produto produto, VendaCompraLojaVirtual vendaCompraLojaVirtual) {
    this.quantidade = quantidade;
    this.produto = produto;
    this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
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

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public VendaCompraLojaVirtual getVendaCompraLojaVirtual() {
    return vendaCompraLojaVirtual;
  }

  public void setVendaCompraLojaVirtual(VendaCompraLojaVirtual vendaCompraLojaVirtual) {
    this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
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
    ItemVendaLoja other = (ItemVendaLoja) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

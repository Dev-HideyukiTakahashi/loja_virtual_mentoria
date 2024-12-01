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
public class StatusRastreio {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String centroDistribuicao;
  private String cidade;
  private String estado;
  private String status;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "venda_compra_loja_virtual_fk"))
  private VendaCompraLojaVirtual vendaCompraLojaVirtual;

  public StatusRastreio() {
  }

  public StatusRastreio(String centroDistribuicao, String cidade, String estado, String status) {
    this.centroDistribuicao = centroDistribuicao;
    this.cidade = cidade;
    this.estado = estado;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCentroDistribuicao() {
    return centroDistribuicao;
  }

  public void setCentroDistribuicao(String centroDistribuicao) {
    this.centroDistribuicao = centroDistribuicao;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    StatusRastreio other = (StatusRastreio) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

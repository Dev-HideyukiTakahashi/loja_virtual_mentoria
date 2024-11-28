package com.jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class CupomDesconto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String codigoDesconto;
  private BigDecimal valorRealDesconto;
  private BigDecimal valorPorcentDesconto;

  @Temporal(TemporalType.DATE)
  private Date dataValidadeCupom;

  public CupomDesconto() {
  }

  public CupomDesconto(String codigoDesconto, BigDecimal valorRealDesconto, BigDecimal valorPorcentDesconto,
      Date dataValidadeCupom) {
    this.codigoDesconto = codigoDesconto;
    this.valorRealDesconto = valorRealDesconto;
    this.valorPorcentDesconto = valorPorcentDesconto;
    this.dataValidadeCupom = dataValidadeCupom;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCodigoDesconto() {
    return codigoDesconto;
  }

  public void setCodigoDesconto(String codigoDesconto) {
    this.codigoDesconto = codigoDesconto;
  }

  public BigDecimal getValorRealDesconto() {
    return valorRealDesconto;
  }

  public void setValorRealDesconto(BigDecimal valorRealDesconto) {
    this.valorRealDesconto = valorRealDesconto;
  }

  public BigDecimal getValorPorcentDesconto() {
    return valorPorcentDesconto;
  }

  public void setValorPorcentDesconto(BigDecimal valorPorcentDesconto) {
    this.valorPorcentDesconto = valorPorcentDesconto;
  }

  public Date getDataValidadeCupom() {
    return dataValidadeCupom;
  }

  public void setDataValidadeCupom(Date dataValidadeCupom) {
    this.dataValidadeCupom = dataValidadeCupom;
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
    CupomDesconto other = (CupomDesconto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

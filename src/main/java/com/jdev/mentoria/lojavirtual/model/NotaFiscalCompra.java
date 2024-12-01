package com.jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class NotaFiscalCompra {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String numeroNota;
  private String serieNota;
  private String descricaoObs;
  private BigDecimal valorTotal;
  private BigDecimal valorDesconto;
  private BigDecimal valorIcms;

  @Temporal(TemporalType.DATE)
  private Date dataCompra;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
  private Pessoa pessoa;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk"))
  private ContaPagar contaPagar;

  public NotaFiscalCompra() {
  }

  public NotaFiscalCompra(String numeroNota, String serieNota, String descricaoObs, BigDecimal valorTotal,
      BigDecimal valorDesconto, BigDecimal valorIcms, Date dataCompra, Pessoa pessoa, ContaPagar contaPagar) {
    this.numeroNota = numeroNota;
    this.serieNota = serieNota;
    this.descricaoObs = descricaoObs;
    this.valorTotal = valorTotal;
    this.valorDesconto = valorDesconto;
    this.valorIcms = valorIcms;
    this.dataCompra = dataCompra;
    this.pessoa = pessoa;
    this.contaPagar = contaPagar;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumeroNota() {
    return numeroNota;
  }

  public void setNumeroNota(String numeroNota) {
    this.numeroNota = numeroNota;
  }

  public String getSerieNota() {
    return serieNota;
  }

  public void setSerieNota(String serieNota) {
    this.serieNota = serieNota;
  }

  public String getDescricaoObs() {
    return descricaoObs;
  }

  public void setDescricaoObs(String descricaoObs) {
    this.descricaoObs = descricaoObs;
  }

  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }

  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  public BigDecimal getValorIcms() {
    return valorIcms;
  }

  public void setValorIcms(BigDecimal valorIcms) {
    this.valorIcms = valorIcms;
  }

  public Date getDataCompra() {
    return dataCompra;
  }

  public void setDataCompra(Date dataCompra) {
    this.dataCompra = dataCompra;
  }

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public ContaPagar getContaPagar() {
    return contaPagar;
  }

  public void setContaPagar(ContaPagar contaPagar) {
    this.contaPagar = contaPagar;
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
    NotaFiscalCompra other = (NotaFiscalCompra) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VendaCompraLojaVirtual {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
  private Pessoa pessoa;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_entrega_fk"))
  private Endereco enderecoEntrega;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_cobranca_fk"))
  private Endereco enderecoCobranca;

  private BigDecimal valorTotal;
  private BigDecimal valorDesconto;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "forma_pagamento_fk"))
  private FormaPagamento formaPagamento;

  @OneToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_venda_fk"))
  private NotaFiscalVenda notaFiscalVenda;

  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "cupom_desconto_fk"))
  private CupomDesconto cupomDesconto;

  private BigDecimal valorFrete;
  private Integer diasEntrega;

  @Temporal(TemporalType.DATE)
  private Date dataVenda;

  @Temporal(TemporalType.DATE)
  private Date dataEntrega;

  public VendaCompraLojaVirtual() {
  }

  public VendaCompraLojaVirtual(Pessoa pessoa, Endereco enderecoEntrega, Endereco enderecoCobranca,
      BigDecimal valorTotal, BigDecimal valorDesconto, FormaPagamento formaPagamento, NotaFiscalVenda notaFiscalVenda,
      CupomDesconto cupomDesconto, BigDecimal valorFrete, Integer diasEntrega, Date dataVenda, Date dataEntrega) {
    this.pessoa = pessoa;
    this.enderecoEntrega = enderecoEntrega;
    this.enderecoCobranca = enderecoCobranca;
    this.valorTotal = valorTotal;
    this.valorDesconto = valorDesconto;
    this.formaPagamento = formaPagamento;
    this.notaFiscalVenda = notaFiscalVenda;
    this.cupomDesconto = cupomDesconto;
    this.valorFrete = valorFrete;
    this.diasEntrega = diasEntrega;
    this.dataVenda = dataVenda;
    this.dataEntrega = dataEntrega;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public Endereco getEnderecoEntrega() {
    return enderecoEntrega;
  }

  public void setEnderecoEntrega(Endereco enderecoEntrega) {
    this.enderecoEntrega = enderecoEntrega;
  }

  public Endereco getEnderecoCobranca() {
    return enderecoCobranca;
  }

  public void setEnderecoCobranca(Endereco enderecoCobranca) {
    this.enderecoCobranca = enderecoCobranca;
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

  public FormaPagamento getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(FormaPagamento formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public NotaFiscalVenda getNotaFiscalVenda() {
    return notaFiscalVenda;
  }

  public void setNotaFiscalVenda(NotaFiscalVenda notaFiscalVenda) {
    this.notaFiscalVenda = notaFiscalVenda;
  }

  public CupomDesconto getCupomDesconto() {
    return cupomDesconto;
  }

  public void setCupomDesconto(CupomDesconto cupomDesconto) {
    this.cupomDesconto = cupomDesconto;
  }

  public BigDecimal getValorFrete() {
    return valorFrete;
  }

  public void setValorFrete(BigDecimal valorFrete) {
    this.valorFrete = valorFrete;
  }

  public Integer getDiasEntrega() {
    return diasEntrega;
  }

  public void setDiasEntrega(Integer diasEntrega) {
    this.diasEntrega = diasEntrega;
  }

  public Date getDataVenda() {
    return dataVenda;
  }

  public void setDataVenda(Date dataVenda) {
    this.dataVenda = dataVenda;
  }

  public Date getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(Date dataEntrega) {
    this.dataEntrega = dataEntrega;
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
    VendaCompraLojaVirtual other = (VendaCompraLojaVirtual) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

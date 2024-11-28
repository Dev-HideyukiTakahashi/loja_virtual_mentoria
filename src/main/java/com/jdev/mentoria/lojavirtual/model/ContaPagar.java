package com.jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;

import com.jdev.mentoria.lojavirtual.model.enums.StatusContaPagar;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class ContaPagar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  private String descricao;

  @Enumerated(EnumType.STRING)
  private StatusContaPagar status;

  @Temporal(TemporalType.DATE)
  private Date dataVencimento;

  @Temporal(TemporalType.DATE)
  private Date dataPagamento;

  private BigDecimal valorTotal;
  private BigDecimal valorDesconto;

  @ManyToOne
  private Pessoa pessoa;

  @ManyToOne
  private Pessoa pessoaFornecedor;

  public ContaPagar() {
  }

  public ContaPagar(String descricao, StatusContaPagar status, Date dataVencimento, Date dataPagamento,
      BigDecimal valorTotal, BigDecimal valorDesconto, Pessoa pessoa, Pessoa pessoaFornecedor) {
    this.descricao = descricao;
    this.status = status;
    this.dataVencimento = dataVencimento;
    this.dataPagamento = dataPagamento;
    this.valorTotal = valorTotal;
    this.valorDesconto = valorDesconto;
    this.pessoa = pessoa;
    this.pessoaFornecedor = pessoaFornecedor;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public StatusContaPagar getStatus() {
    return status;
  }

  public void setStatus(StatusContaPagar status) {
    this.status = status;
  }

  public Date getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public Date getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
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

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  public Pessoa getPessoaFornecedor() {
    return pessoaFornecedor;
  }

  public void setPessoaFornecedor(Pessoa pessoaFornecedor) {
    this.pessoaFornecedor = pessoaFornecedor;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ContaPagar other = (ContaPagar) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}

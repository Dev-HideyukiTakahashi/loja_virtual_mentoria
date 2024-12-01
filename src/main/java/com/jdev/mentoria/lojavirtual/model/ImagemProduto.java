package com.jdev.mentoria.lojavirtual.model;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ImagemProduto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "text")
  private String imagemOriginal;

  @Column(columnDefinition = "text")
  private String imagemMiniatura;

  /* Sem a @ForeignKey o postgres gera uma chave aleatória */
  @ManyToOne
  @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
  private Produto produto;

  public ImagemProduto() {
  }

  public ImagemProduto(String imagemOriginal, String imagemMiniatura, Produto produto) {
    this.imagemOriginal = imagemOriginal;
    this.imagemMiniatura = imagemMiniatura;
    this.produto = produto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getImagemOriginal() {
    return imagemOriginal;
  }

  public void setImagemOriginal(String imagemOriginal) {
    this.imagemOriginal = imagemOriginal;
  }

  public String getImagemMiniatura() {
    return imagemMiniatura;
  }

  public void setImagemMiniatura(String imagemMiniatura) {
    this.imagemMiniatura = imagemMiniatura;
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
    ImagemProduto other = (ImagemProduto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
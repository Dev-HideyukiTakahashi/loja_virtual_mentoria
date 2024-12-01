package com.jdev.mentoria.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdev.mentoria.lojavirtual.model.Acesso;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Long> {

}

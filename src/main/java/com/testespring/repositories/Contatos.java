package com.testespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespring.domain.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}

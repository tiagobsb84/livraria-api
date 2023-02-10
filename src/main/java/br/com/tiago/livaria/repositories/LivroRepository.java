package br.com.tiago.livaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiago.livaria.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}

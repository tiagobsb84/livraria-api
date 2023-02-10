package br.com.tiago.livaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiago.livaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}

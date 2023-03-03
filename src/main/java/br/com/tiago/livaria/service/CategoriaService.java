package br.com.tiago.livaria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiago.livaria.domain.Categoria;
import br.com.tiago.livaria.repositories.CategoriaRepository;
import br.com.tiago.livaria.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorId(Integer id) {
		Optional<Categoria> obj = this.categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
				+ id + ", Tipo: " + Categoria.class.getName()));
	}
}

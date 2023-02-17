package br.com.tiago.livaria.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiago.livaria.domain.Categoria;
import br.com.tiago.livaria.domain.Livro;
import br.com.tiago.livaria.repositories.CategoriaRepository;
import br.com.tiago.livaria.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro TI");
		Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Ficção Cientifica");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");
		
		Livro liv1 = new Livro(null, "UML", "Rosana Vaccara", "Aprenda UML", cat1);
		Livro liv2 = new Livro(null, "Engenharia de Software", "Louis V.", "Software", cat1);
		Livro liv3 = new Livro(null, "Do mil ao milhão", "Thiago Nigro", "Leitura", cat3);
		Livro liv4 = new Livro(null, "O Hobbit", "Reinaldo José", "Poster", cat2);
		Livro liv5 = new Livro(null, "O pequeno principe", "Antoine de Saint", "principe", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(liv1, liv2, liv5));
		cat2.getLivros().addAll(Arrays.asList(liv4));
		cat3.getLivros().addAll(Arrays.asList(liv3));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(liv1, liv2, liv3, liv4, liv5));
	}
}

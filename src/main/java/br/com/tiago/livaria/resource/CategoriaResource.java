package br.com.tiago.livaria.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiago.livaria.domain.Categoria;
import br.com.tiago.livaria.service.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> buscarPeloIdCategoria(@PathVariable Integer id) {
		Categoria obj = this.categoriaService.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}

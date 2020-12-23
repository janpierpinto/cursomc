package com.janpier.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.janpier.cursomc.domain.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
  
  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public   List<Categoria> listar () {
    Categoria cat1 = new Categoria(1, "Informática");
    Categoria cat2 = new Categoria(2, "Escritório");
    
    List<Categoria> lista = new ArrayList<Categoria>();
    lista.add(cat1);
    lista.add(cat2);
    
    return lista;
  }
}

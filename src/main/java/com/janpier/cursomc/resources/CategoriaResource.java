package com.janpier.cursomc.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.janpier.cursomc.domain.Categoria;
import com.janpier.cursomc.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
  
  @Autowired
  private CategoriaService service;
  
  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> buscar (@PathVariable Integer id) {
    Categoria obj = service.buscar(id);
    if (obj != null) return ResponseEntity.ok().body(obj);
    HashMap<String, Object> response = new HashMap<>();
    response.put("Error", "Not Found");
    return ResponseEntity.badRequest().body(response);
  }
}

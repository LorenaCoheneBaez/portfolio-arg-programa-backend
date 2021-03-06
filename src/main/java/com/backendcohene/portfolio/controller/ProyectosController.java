package com.backendcohene.portfolio.controller;


import com.backendcohene.portfolio.entity.Proyectos;
import com.backendcohene.portfolio.service.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired
    ProyectosService proyectosService;

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> findAllProyectos() {
        List<Proyectos> proyectos = proyectosService.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Proyectos> findProyecto(@PathVariable("id") Long id) {
        Proyectos proyecto = proyectosService.findProyecto(id);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyecto (@RequestBody Proyectos proyecto) {
        Proyectos newProyecto = proyectosService.addProyecto(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos (@RequestBody Proyectos skill) {
        Proyectos updateProyectos = proyectosService.updateProyectos(skill);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto (@PathVariable("id") Long id) {
        proyectosService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

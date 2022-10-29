package com.as.crudd1.controllers;

import com.as.crudd1.models.Crudd1;
import com.as.crudd1.services.Crudd1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crudd1")
public class Crudd1Controllers {

    private final Crudd1Service crudd1Service;

    public Crudd1Controllers(Crudd1Service crudd1Service) {
        this.crudd1Service = crudd1Service;
    }

    @PostMapping("/crear")
    public Crudd1 crearCrudd1(@RequestBody Crudd1 crudd1){
        return crudd1Service.crearCrudd1(crudd1);
    }

    @GetMapping("/listar")
    public List<Crudd1> listarCrudd1(){
        return crudd1Service.listarCrudd1();
    }

    @GetMapping("/listar/{id}")
    public Crudd1 crudd1PorId(@PathVariable("id") Long id){
        return crudd1Service.crudd1PorId(id);
    }

    @GetMapping("/listar/{nombre}")
    public List<Crudd1> crudd1PorNombre(@PathVariable("nombre") String nombre){
        return crudd1Service.crudd1PorNombre(nombre);
    }

    @PutMapping("/actualizar/{id]")
    public Crudd1 actualizarCrudd1(@PathVariable("id") Long crudd1Id, @RequestBody Crudd1 crudd1Nuevo){
        return crudd1Service.actualizarCrudd1(crudd1Id,crudd1Nuevo);
    }

    @DeleteMapping("eliminar/{id}")
    public Crudd1 eliminarCrudd1(@PathVariable("id") Long crudd1Id){
        return crudd1Service.eliminarCrudd1(crudd1Id);
    }
}

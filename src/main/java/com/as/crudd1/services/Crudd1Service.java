package com.as.crudd1.services;

import com.as.crudd1.models.Crudd1;

import java.util.List;

public interface Crudd1Service {

    Crudd1 crearCrudd1(Crudd1 crudd1);

    List<Crudd1> listarCrudd1();

    Crudd1 crudd1PorId(Long id);

    List<Crudd1> crudd1PorNombre(String nombre);

    Crudd1 actualizarCrudd1(Long crudd1Id, Crudd1 crudd1Nuevo);

    Crudd1 eliminarCrudd1(Long crudd1Id);

}

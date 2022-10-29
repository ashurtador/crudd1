package com.as.crudd1.services;

import com.as.crudd1.models.Crudd1;
import com.as.crudd1.repository.Crudd1Reposory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Crudd1ServiceImpl implements Crudd1Service{

    private final Crudd1Reposory crudd1Reposory;

    public Crudd1ServiceImpl(Crudd1Reposory crudd1Reposory) {
        this.crudd1Reposory = crudd1Reposory;
    }

    @Override
    public Crudd1 crearCrudd1(Crudd1 crudd1) {

        Crudd1 nuevoCrudd1 =crudd1;
        crudd1Reposory.save(nuevoCrudd1);
        return nuevoCrudd1;
    }

    @Override
    public List<Crudd1> listarCrudd1() {

        List<Crudd1> crudd1List =crudd1Reposory.findAll();
        return crudd1List;
    }

    @Override
    public Crudd1 crudd1PorId(Long id) {
        Crudd1 crudd1ById = crudd1Reposory.findById(id).orElseThrow();
        return crudd1ById;
    }

    @Override
    public List<Crudd1> crudd1PorNombre(String nombre) {

        List<Crudd1> crudd1List = crudd1Reposory.getByNombre(nombre);
        return crudd1List;
    }

    @Override
    public Crudd1 actualizarCrudd1(Long crudd1Id, Crudd1 crudd1Nuevo) {
        Crudd1 crudd1ById = crudd1Reposory.findById(crudd1Id).orElseThrow();
        crudd1ById.setNombre(crudd1Nuevo.getNombre());
        crudd1ById.setCorreo(crudd1Nuevo.getCorreo());
        crudd1Reposory.save(crudd1ById);
        return crudd1ById;
    }

    @Override
    public Crudd1 eliminarCrudd1(Long crudd1Id) {
        Crudd1 crudd1ById = crudd1Reposory.findById(crudd1Id).orElseThrow();
        crudd1Reposory.delete(crudd1ById);
        return crudd1ById;
    }
}

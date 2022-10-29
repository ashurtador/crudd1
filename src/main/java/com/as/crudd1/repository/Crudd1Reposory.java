package com.as.crudd1.repository;

import com.as.crudd1.Crudd1Application;
import com.as.crudd1.models.Crudd1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Crudd1Reposory extends JpaRepository <Crudd1, Long> {
    List<Crudd1> getByNombre(String nombre);



}


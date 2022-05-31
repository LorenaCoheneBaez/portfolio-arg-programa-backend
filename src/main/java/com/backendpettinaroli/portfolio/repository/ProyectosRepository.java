package com.backendcohene.portfolio.repository;


import com.backendcohene.portfolio.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    void deleteProyectoById(Long id);

    Optional<Proyectos> findProyectoById(Long id);
}

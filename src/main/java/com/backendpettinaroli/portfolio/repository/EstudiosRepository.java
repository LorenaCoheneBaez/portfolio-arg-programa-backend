package com.backendcohene.portfolio.repository;


import com.backendcohene.portfolio.entity.Estudios;
import com.backendcohene.portfolio.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudiosRepository extends JpaRepository<Estudios, Long> {
    void deleteEstudiosById(Long id);

    Optional<Estudios> findEstudiosById(Long id);
}

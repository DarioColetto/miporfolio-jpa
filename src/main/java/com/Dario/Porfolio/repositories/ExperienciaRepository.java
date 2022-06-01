package com.Dario.Porfolio.repositories;

import com.Dario.Porfolio.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Integer> {
}

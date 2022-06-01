package com.Dario.Porfolio.repositories;


import com.Dario.Porfolio.models.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Integer> {
}

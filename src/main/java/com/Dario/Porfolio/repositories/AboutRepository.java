package com.Dario.Porfolio.repositories;

import com.Dario.Porfolio.models.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Integer> {
}

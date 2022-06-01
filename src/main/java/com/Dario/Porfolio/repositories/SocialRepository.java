package com.Dario.Porfolio.repositories;


import com.Dario.Porfolio.models.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository<Social, Integer>{
}

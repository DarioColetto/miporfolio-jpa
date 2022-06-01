
package com.Dario.Porfolio.repositories;

import com.Dario.Porfolio.models.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository<Formacion, Integer> {
    
}

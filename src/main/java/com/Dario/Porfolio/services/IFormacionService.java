
package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Formacion;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public interface IFormacionService {
    
   public void add(Formacion formacion);
   public Formacion get(int id_formacion);
   public List<Formacion> getAll();
   public  void update(Formacion formacion);
   public void delete(int id_formacion);
    
}

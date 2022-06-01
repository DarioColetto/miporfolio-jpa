
package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Proyecto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProyectoService {
    
   void add(Proyecto proyecto);
   Proyecto get(int id_proyecto);
   List<Proyecto> getAll();
   void update(Proyecto proyecto);
   void delete(int id_proyecto);
}

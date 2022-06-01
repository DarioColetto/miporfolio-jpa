
package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Proyecto;
import com.Dario.Porfolio.repositories.ProyectoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyectoRepository;
    
    @Override
    public void add(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public Proyecto get(int id) {

        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Proyecto> getAll() {
        return proyectoRepository.findAll();
    }

    @Override
    public void update(Proyecto proyecto) {

        proyectoRepository.save(proyecto);

    }

    @Override
    public void delete(int id) {
        proyectoRepository.deleteById(id);
    }
    
}

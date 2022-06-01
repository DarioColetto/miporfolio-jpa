
package com.Dario.Porfolio.services;


import com.Dario.Porfolio.models.Formacion;
import com.Dario.Porfolio.repositories.FormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService {

    @Autowired
    FormacionRepository formacionRepository;
    
    @Override
    public void add(Formacion formacion) {
        formacionRepository.save(formacion);
    }

    @Override
    public Formacion get(int id_formacion) {
       return formacionRepository.findById(id_formacion).orElse(null);
    }

    @Override
    public List<Formacion> getAll() {
        return formacionRepository.findAll();
    }

    @Override
    public void update(Formacion formacion) {
        formacionRepository.save(formacion);
    }

    @Override
    public void delete(int id_formacion) {

        formacionRepository.deleteById(id_formacion);
    }
    




     
    
}

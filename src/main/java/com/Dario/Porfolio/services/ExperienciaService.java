package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Experiencia;
import com.Dario.Porfolio.repositories.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository experienciaRepository;

    @Override
    public void add(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public Experiencia get(int id_experiencia) {
        return experienciaRepository.getById(id_experiencia);
    }

    @Override
    public List<Experiencia> getAll() {
        return experienciaRepository.findAll();
    }

    @Override
    public void update(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public void delete(int id_experiencia) {
        experienciaRepository.deleteById(id_experiencia);
    }
}

package com.Dario.Porfolio.services;

import com.Dario.Porfolio.repositories.TecnologiaRepository;
import com.Dario.Porfolio.models.Tecnologia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TecnologiaService implements ITecnologiasService {

    @Autowired
    public TecnologiaRepository tecnologiaRepository;

    @Override
    public void add(Tecnologia tecnologia) {

        tecnologiaRepository.save(tecnologia);
    }

    @Override
    public Tecnologia get(int id_tecnologia) {

        return tecnologiaRepository.findById(id_tecnologia).orElse(null);
    }

    @Override
    public List<Tecnologia> getAll() {

        return tecnologiaRepository.findAll();
    }

    @Override
    public void update(Tecnologia tecnologia) {

        tecnologiaRepository.save(tecnologia);
    }

    @Override
    public void delete(int id_tecnologia) {

        tecnologiaRepository.deleteById(id_tecnologia);
    }
}

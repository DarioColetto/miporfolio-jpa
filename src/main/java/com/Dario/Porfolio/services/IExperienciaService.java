package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Experiencia;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface IExperienciaService {


    public void add(Experiencia experiencia);
    public Experiencia get(int id_experiencia);
    public List<Experiencia> getAll();
    public  void update(Experiencia experiencia);
    public void delete(int id_experiencia);


}

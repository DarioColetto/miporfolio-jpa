package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Tecnologia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITecnologiasService {


        public void add(Tecnologia tecnologia);
        public Tecnologia get(int id_tecnologia);
        public List<Tecnologia> getAll();
        public  void update(Tecnologia tecnologia);
        public void delete(int id_tecnologia);



}

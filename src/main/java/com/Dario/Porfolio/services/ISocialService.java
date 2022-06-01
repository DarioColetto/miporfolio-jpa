package com.Dario.Porfolio.services;


import com.Dario.Porfolio.models.Social;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISocialService {

    public void add(Social social);
    public Social get(int id_social);
    public List<Social> getAll();
    public  void update(Social  social);
    public void delete(int id_social);
}

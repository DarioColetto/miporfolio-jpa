package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.About;
import org.springframework.stereotype.Service;

@Service
public interface IAboutService {

    public About get(int id_about);

    public  void update(About id_about);

}

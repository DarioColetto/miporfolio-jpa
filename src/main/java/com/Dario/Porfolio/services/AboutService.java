package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.About;
import com.Dario.Porfolio.repositories.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {

    @Autowired
    AboutRepository aboutRepo;

    @Override
    public About get(int id_about) {
        return aboutRepo.findById(id_about).orElse(null);
    }


    @Override
    public void update(About about) {aboutRepo.save(about);}


}

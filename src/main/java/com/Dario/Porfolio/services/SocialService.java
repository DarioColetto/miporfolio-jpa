package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.Social;
import com.Dario.Porfolio.repositories.SocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService implements ISocialService{

    @Autowired
    SocialRepository socialRepository;

    @Override
    public void add(Social social) {
        socialRepository.save(social);
    }

    @Override
    public Social get(int id_social) {
        return socialRepository.findById(id_social).orElse(null);
    }

    @Override
    public List<Social> getAll() {
        return socialRepository.findAll();
    }

    @Override
    public void update(Social social) {
        socialRepository.save(social);
    }

    @Override
    public void delete(int id_social) {
        socialRepository.deleteById(id_social);
    }
}

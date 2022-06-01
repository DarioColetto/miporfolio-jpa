
package com.Dario.Porfolio.services;


import com.Dario.Porfolio.models.User;
import com.Dario.Porfolio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {

    @Autowired
    public UserRepository userRepository;


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

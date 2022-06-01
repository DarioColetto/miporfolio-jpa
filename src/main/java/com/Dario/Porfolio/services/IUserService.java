
package com.Dario.Porfolio.services;

import com.Dario.Porfolio.models.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    User findByUsername(String username);


}

package com.Dario.Porfolio.Controllers;


import com.Dario.Porfolio.models.Tokener;
import com.Dario.Porfolio.models.User;
import com.Dario.Porfolio.services.IUserService;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://miporfolio-jpa.herokuapp.com", maxAge=3600)

@RestController
@RequestMapping("/authorize")
public class AuthorizationController {


    @Autowired
    IUserService iUserService;


    @Value("${my.header}")
    String header;

    @Value("${my.payload}")
    String payload;

    @Value("${my.signature}")
    String signature;

    @PostMapping( produces= MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody ResponseEntity<?> authorize(
                                    @RequestBody @NotNull User new_user
                                                     ) {

        String token_str;

        JSONObject token_json= new JSONObject();


        //Logic for response
        User current_user = iUserService.findByUsername(new_user.getUsername());

        if (new_user.getPassword().equals(current_user.getPassword()) && new_user.getEmail().equals(current_user.getEmail())){
            token_str = header + "." + payload + "." + signature;

        }
        else {
            token_str = "";
        }

        token_json.put("response", token_str);
        return ResponseEntity.status(HttpStatus.OK).body(token_json.toString());
    }




}

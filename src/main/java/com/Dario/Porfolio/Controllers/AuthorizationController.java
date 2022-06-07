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

@CrossOrigin(origins = "https://miporfolio-jpa.herokuapp.com/", maxAge=3600)

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

    @PostMapping(value="/{username}" , produces= MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody ResponseEntity<?> authorize(@PathVariable String username,
                                    @RequestBody @NotNull User new_user
                                                     ) {
        //Creates the token
        String token_str = String.format(header, ".", payload, ".", signature);


        //Creates JSonObject and ads the k:v
        JSONObject token_json= new JSONObject();
        token_json.put("token", token_str);

        //Logic for response
        User current_user = iUserService.findByUsername(username);

        if (new_user.getPassword().equals(current_user.getPassword()) && new_user.getEmail().equals(current_user.getEmail())){
            return ResponseEntity.status(HttpStatus.OK).body(token_json.toString());
        }
        else {
            return null;
        }
    }




}

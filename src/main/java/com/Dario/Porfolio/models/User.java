
package com.Dario.Porfolio.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name= "persona")

public class User {
    
    @Id

    @Column(name = "id_persona")
    private int id_persona;


    @Column(name= "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;


}



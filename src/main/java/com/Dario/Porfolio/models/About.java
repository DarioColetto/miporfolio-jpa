package com.Dario.Porfolio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity @Table(name= "about")

@NoArgsConstructor
@AllArgsConstructor

public class About {

    @Id
    @Column(name = "id_about")
    private int id_about;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "foto_perfil")
    private String foto_perfil;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "email")
    private String email;

    @Column(name = "tel")
    private String tel;


}

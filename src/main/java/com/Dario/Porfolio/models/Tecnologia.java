package com.Dario.Porfolio.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name= "tecnologia")
@Getter @Setter
public class Tecnologia {

    @Id
    @GeneratedValue(generator="Seq_Id_Tecnologia", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="Seq_Id_Tecnologia",sequenceName="Seq_Id_Tecnologia", allocationSize=1)

    @Column(name="id_tecnologia")
    private int id_tecnologia;

    @Column (name="nombre_tecnologia")
    private String nombre_tecnologia;

    @Column (name="descripcion")
    private String descripcion;

    @Column(name="nivel")
    private float nivel;

}


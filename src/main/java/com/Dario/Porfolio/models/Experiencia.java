
package com.Dario.Porfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name= "experiencia")
@JsonIgnoreProperties({"hibernateLazyInitializer"})  //Anula el error status500 , cuando ponia el get() del experiencia controller
public class Experiencia {

    @Id
    @GeneratedValue(generator="Seq_Id_experiencia", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="Seq_Id_experiencia",sequenceName="Seq_Id_experiencia", allocationSize=1)

    @Column(name = "id_experiencia")
    private int id_experiencia;

    @Column(name = "nombre_empresa")
    private String nombre_empresa;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ano_inicio")
    private int ano_inicio;

    @Column(name = "ano_finalizacion")
    private int ano_finalizacion;

    @Column( name = "web")
    private String web;

    @Column( name = "url_logo")
    private String url_logo;


}

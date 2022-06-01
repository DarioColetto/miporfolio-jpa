
package com.Dario.Porfolio.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name="formacion")
public class Formacion {
    
    @Id
    @GeneratedValue(generator="Seq_Id_Formacion", strategy= GenerationType.SEQUENCE) 
    @SequenceGenerator(name="Seq_Id_Formacion",sequenceName="Seq_Id_Formacion", allocationSize=1)

    @Column(name = "id_formacion")
    private int id_formacion;
    
    @Column(name = "nombre_institucion")
    private String nombre_institucion;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ano_inicio")
    private int ano_inicio;

    @Column(name = "ano_finalizacion")
    private int ano_finalizacion;

    @Column(name = "duracion")
    private int duracion;

    @Column( name = "url_logo")
    private String url_logo;

    
}

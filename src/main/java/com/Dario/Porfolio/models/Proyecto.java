
package com.Dario.Porfolio.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter @Setter
@Entity @Table(name = "proyecto")
public class Proyecto {
    
    @Id
/*    @GeneratedValue(generator="Seq_Id_Proyecto", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="Seq_Id_Proyecto",sequenceName="Seq_Id_Proyecto", allocationSize=1)*/

    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "id_proyecto")
    private int id_proyecto;

    @Column(name = "nombre_proyecto")
    private String nombre_proyecto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name="tecnologias")
    private String tecnologias;

    @Column(name="url_logo")
    private String url_logo;

    public Proyecto(String nombre_proyecto, String descripcion, String tecnologias, String url_logo) {
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion = descripcion;
        this.tecnologias = tecnologias;
        this.url_logo = url_logo;
    }
}

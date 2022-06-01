package com.Dario.Porfolio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "social")
@Getter@Setter
public class Social {

    @Id
    @GeneratedValue(generator="Seq_Id_Social", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="Seq_Id_Social",sequenceName="Seq_Id_Social", allocationSize=1)
    @Column (name = "id_social")
    private int id_social;

    @Column(name = "nombre_social")
    private String nombre_social;

    @Column(name = "url_social")
    private String url_social;

    @Column(name = "bootstrap_class")
    private String bootstrap_class;

}

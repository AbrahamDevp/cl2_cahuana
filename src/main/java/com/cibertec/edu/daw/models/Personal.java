package com.cibertec.edu.daw.models;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Personal")
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="Codigo_Trabajador")
    private Long codigo;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="Sueldo")
    private String sueldo;

    @Column(name="Codigo_Area")
    private Long area;

}
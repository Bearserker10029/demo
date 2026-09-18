package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proveedores", schema = "petzone")
public class Proveedore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedorid", nullable = false)
    private Integer id;

    @Column(name = "codigoproveedor", nullable = false, length = 50)
    private String codigoproveedor;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "ciudad", length = 100)
    private String ciudad;


}
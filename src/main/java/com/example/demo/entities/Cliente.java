package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes", schema = "petzone")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteid", nullable = false)
    private Integer id;

    @Column(name = "codigocliente", nullable = false, length = 50)
    private String codigocliente;

    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    @Column(name = "direccion", nullable = false)
    private String direccion;


}
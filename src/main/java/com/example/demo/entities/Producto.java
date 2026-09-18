package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "productos", schema = "petzone")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productoid", nullable = false)
    private Integer id;

    @Column(name = "codigoproducto", nullable = false, length = 50)
    private String codigoproducto;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "preciounitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal preciounitario;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoriaid", nullable = false)
    private Categoria categoriaid;


}
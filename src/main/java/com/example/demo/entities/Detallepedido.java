package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "detallepedidos", schema = "petzone")
public class Detallepedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalleid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pedidoid", nullable = false)
    private Pedido pedidoid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productoid", nullable = false)
    private Producto productoid;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "preciounitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal preciounitario;


}
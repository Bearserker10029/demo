package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "pedidos", schema = "petzone")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedidoid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clienteid", nullable = false)
    private Cliente clienteid;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;


}
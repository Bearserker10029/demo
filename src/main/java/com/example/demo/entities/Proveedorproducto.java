package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proveedorproducto", schema = "petzone")
public class Proveedorproducto {
    @EmbeddedId
    private ProveedorproductoId id;

    @MapsId("proveedorid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proveedorid", nullable = false)
    private Proveedore proveedorid;

    @MapsId("productoid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productoid", nullable = false)
    private Producto productoid;


}
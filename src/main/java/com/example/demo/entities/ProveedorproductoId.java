package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class ProveedorproductoId implements Serializable {
    @Serial
    private static final long serialVersionUID = -8422690471726463180L;
    @Column(name = "proveedorid", nullable = false)
    private Integer proveedorid;

    @Column(name = "productoid", nullable = false)
    private Integer productoid;


}
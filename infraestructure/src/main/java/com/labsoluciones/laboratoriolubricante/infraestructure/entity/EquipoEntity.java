package com.labsoluciones.laboratoriolubricante.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "equipo")
@Getter
@Setter
public class EquipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipo_id")
    private Long equipoId;
    @Column(name = "nomEquipo", nullable = false)
    private String nom_equipo;
    @Column(name = "marca", nullable = false)
    private String marca;
    @Column(name = "modelo", nullable = false)
    private String modelo;
    @Column(name = "estado", nullable = false)
    private Integer estado;
    @Column(name = "usua_crea", length = 45)
    private String usuaCrea;
    @Column(name = "date_create")
    private Timestamp dateCreate;
    @Column(name = "usua_modif", length = 45)
    private String usuaModif;
    @Column(name = "date_modif")
    private Timestamp dateModif;
    @Column(name = "usua_delet", length = 45)
    private String usuaDelet;
    @Column(name = "date_delet")
    private Timestamp dateDelet;

    // Relacion con Cliente
}

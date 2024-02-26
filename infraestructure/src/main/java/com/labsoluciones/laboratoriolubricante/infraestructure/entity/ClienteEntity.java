package com.labsoluciones.laboratoriolubricante.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long clienteId;
    @Column(name = "ruc", nullable = false, length = 15)
    private String ruc;
    @Column(name = "razon_social", nullable = false, length = 200)
    private String razonSocial;
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
}

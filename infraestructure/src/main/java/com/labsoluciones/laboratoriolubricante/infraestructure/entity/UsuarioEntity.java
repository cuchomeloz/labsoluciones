package com.labsoluciones.laboratoriolubricante.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;
    @Column(name = "nombres", nullable = false, length = 25)
    private String nombres;
    @Column(name = "ape_pat", nullable = false, length = 25)
    private String apePat;
    @Column(name = "ape_mat", nullable = false, length = 25)
    private String apeMat;
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

    // Relacion con cliente
}

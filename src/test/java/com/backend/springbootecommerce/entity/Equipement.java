package com.backend.springbootecommerce.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Equipement")
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nom_equipement")
    private String nomEquipement;

    @Column(name="description")
    private String description;

    @Column(name="prix_unitaire")
    private BigDecimal prixUnitaire;

    @Column(name="image_equipement")
    private String imageEquipement;

    @Column(name="Epuise")
    private boolean estEpuise;

    public Long getId() {
        return id;
    }

    public Equipement() {
    }

    public Equipement(Long id, String nomEquipement, String description, BigDecimal prixUnitaire) {
        this.id = id;
        this.nomEquipement = nomEquipement;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="date_creation")
    private Date dateCreation;

}

package org.aop.gestioncontrat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Contrat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroContrat;
    private String titre;
    private Date date;
    private double montant;
    private String nomClient;
    private String CINClient;
}

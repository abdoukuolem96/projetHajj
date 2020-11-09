package com.esi.mspellerin.entities;


import com.esi.mspellerin.model.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pellerin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPasseport;

    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateN;

    private Long numHotel;

    @Transient
    private Hotel hotel;
}

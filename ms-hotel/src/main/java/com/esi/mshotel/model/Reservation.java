package com.esi.mshotel.model;//package com.esi.model;
//
//
//import com.esi.entities.Hotel;
//import com.esi.entities.Pellerin;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Reservation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id_reservation;
//    @OneToOne
//    private Hotel hotel;
//    @OneToOne
//    private Pellerin pellerin;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dateReservation;
//}

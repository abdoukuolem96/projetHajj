package com.esi.mshotel.controller;//package com.esi.controller;
//
//import com.esi.entities.Hotel;
//import com.esi.entities.Pellerin;
//import com.esi.model.Reservation;
//import com.esi.exceptions.RecordAlreadyPresentException;
//import com.esi.exceptions.RecordNotFoundException;
//import com.esi.service.ReservationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/reservation")
//public class ReservationAPI {
//
//    @Autowired
//    ReservationService reservationService;
//
//    @GetMapping("/allReservation")
//    public Iterable<Reservation> viewAllReservation() {
//        return reservationService.viewAllReservation();
//    }
//
//    @GetMapping("/viewReservation/{id}")
//    @ExceptionHandler(RecordNotFoundException.class)
//    public Reservation viewReservation(@PathVariable("id") Long id_reservation) {
//        return reservationService.viewReservation(id_reservation);
//    }
//
//    @PostMapping("/addReservation")
//    @ExceptionHandler(RecordAlreadyPresentException.class)
//    public void addReservation(@RequestBody Reservation reservation) {
//        reservationService.addReservation(reservation);
//    }
//
//
//}

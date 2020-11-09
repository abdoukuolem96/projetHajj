package com.esi.mshotel.controller;//package com.esi.controller;
//
//import com.esi.entities.Pellerin;
//import com.esi.exceptions.RecordAlreadyPresentException;
//import com.esi.exceptions.RecordNotFoundException;
//import com.esi.service.PellerinService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/pellerin")
//public class PellerinAPI {
//    @Autowired
//    PellerinService pellerinService;
//
//    @PostMapping("/addPellerin")
//    @ExceptionHandler(RecordAlreadyPresentException.class)
//    public void addHotel(@RequestBody Pellerin pellerin) {
//        pellerinService.addPellerin(pellerin);
//    }
//
//    @GetMapping("/allPellerin")
//    public Iterable<Pellerin> viewAllPellerin() {
//        return pellerinService.viewAllPellerins();
//    }
//
//    @GetMapping("/viewPellerin/{id}")
//    @ExceptionHandler(RecordNotFoundException.class)
//    public Pellerin viewPellerin(@PathVariable("id") Long numPasseport) {
//        return pellerinService.viewPellerin(numPasseport);
//    }
//
//    @PutMapping("/updatePellerin")
//    @ExceptionHandler(RecordNotFoundException.class)
//    public void modifyPellerin(@RequestBody Pellerin pellerin) {
//        pellerinService.modifyPellerin(pellerin);
//    }
//
//    @DeleteMapping("/deletePellerin/{id}")
//    @ExceptionHandler(RecordNotFoundException.class)
//    public void removePellerin(@PathVariable("id") Long numPasseport) {
//        pellerinService.removePellerin(numPasseport);
//    }
//
//}

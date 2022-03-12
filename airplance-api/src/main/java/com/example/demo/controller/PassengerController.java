package com.example.demo.controller;

import com.example.demo.response.PassengerListModel;
import com.example.demo.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/passengers")
    public ResponseEntity<PassengerListModel> getAllPassengers() {
        return ResponseEntity.ok(this.passengerService.getPassengers(0, 1000));
    }
}

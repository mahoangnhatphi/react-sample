package com.example.demo.controller;

import com.example.demo.response.PassengerListModel;
import com.example.demo.response.PassengerPaginationModel;
import com.example.demo.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/passengers")
    public ResponseEntity<PassengerListModel> getAllPassengers() {
        return ResponseEntity.ok(this.passengerService.getPassengers(0, 1000));
    }

    @GetMapping("/passengers/{page}/{size}")
    public ResponseEntity<PassengerPaginationModel> getPassengers(
            @PathVariable("page") @NonNull Integer page,
            @PathVariable("size") @NonNull Integer size
    ) {
        Integer totalRecords = size * 10;
        var data = this.passengerService.getPassengers(page - 1, size);
        PassengerPaginationModel passengerPaginationModel = new PassengerPaginationModel();
        passengerPaginationModel.setData(data);
        passengerPaginationModel.setTotalRecords(totalRecords);
        return ResponseEntity.ok(passengerPaginationModel);
    }
}

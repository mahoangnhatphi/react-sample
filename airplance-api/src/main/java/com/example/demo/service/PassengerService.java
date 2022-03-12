package com.example.demo.service;

import com.example.demo.model.Passenger;
import com.example.demo.model.PassengerPageResponse;
import com.example.demo.response.AirlineModel;
import com.example.demo.response.PassengerListModel;
import com.example.demo.response.PassengerModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PassengerService {
    public PassengerListModel getPassengers(int page, int size) {
        RestTemplate restTemplate = new RestTemplate();
        PassengerListModel passengerListModel = new PassengerListModel();
        ResponseEntity<PassengerPageResponse> passengerPageResponse = restTemplate.getForEntity(String.format("https://api.instantwebtools.net/v1/passenger?page=%d&size=%d", page, size),
                PassengerPageResponse.class);
        if (passengerPageResponse.getStatusCode() == HttpStatus.OK) {
            PassengerPageResponse response = passengerPageResponse.getBody();
            var list = Optional.ofNullable(response.getData()).orElse(new ArrayList<>())
                    .stream()
                    .map(e -> {
                        var passengerModel = new PassengerModel();
                        passengerModel.setId(e.getId());
                        passengerModel.setName(e.getName());
                        passengerModel.setTrips(e.getTrips());
                        List<AirlineModel> airlineModels = Optional.ofNullable(e.getAirline()).orElse(new ArrayList<>())
                                        .stream().map(airline -> {
                                            var airlineModel = new AirlineModel();
                                            airlineModel.setName(airline.getName());
                                            airlineModel.setCountry(airline.getCountry());
                                            return airlineModel;
                                }).collect(Collectors.toList());
                        passengerModel.setAirline(airlineModels);
                        return passengerModel;
                    }).collect(Collectors.toList());
            passengerListModel = new PassengerListModel(list);
        }
        return passengerListModel;
    }
}

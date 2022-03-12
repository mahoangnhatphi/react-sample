package com.example.demo.response;

import com.example.demo.model.Airline;

import java.util.List;

public class PassengerModel {
    private String id;
    private String name;
    private long trips;
    private List<AirlineModel> airline;

    public PassengerModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTrips() {
        return trips;
    }

    public void setTrips(long trips) {
        this.trips = trips;
    }

    public List<AirlineModel> getAirline() {
        return airline;
    }

    public void setAirline(List<AirlineModel> airline) {
        this.airline = airline;
    }
}

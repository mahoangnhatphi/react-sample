package com.example.demo.response;


import java.util.ArrayList;
import java.util.Collection;

public class PassengerListModel extends ArrayList<PassengerModel> {
    public PassengerListModel() {
    }

    public PassengerListModel(Collection<? extends PassengerModel> c) {
        super(c);
    }
}

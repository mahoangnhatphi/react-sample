package com.example.demo.response;

import java.util.List;

public class PassengerPaginationModel {
    private List<PassengerModel> data;
    private long totalRecords;

    public PassengerPaginationModel() {
    }

    public List<PassengerModel> getData() {
        return data;
    }

    public void setData(List<PassengerModel> data) {
        this.data = data;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }
}

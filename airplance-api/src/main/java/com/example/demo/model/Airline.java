package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Airline {
    public int id;
    public String name;
    public String country;
    public String logo;
    public String slogan;
    @JsonProperty("head_quaters")
    public String headQuaters;
    public String website;
    public String established;

    public Airline() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getHeadQuaters() {
        return headQuaters;
    }

    public void setHeadQuaters(String headQuaters) {
        this.headQuaters = headQuaters;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEstablished() {
        return established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }
}

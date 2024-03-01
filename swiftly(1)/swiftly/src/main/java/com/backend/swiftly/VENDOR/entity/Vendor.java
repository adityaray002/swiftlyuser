package com.backend.swiftly.VENDOR.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;

    private String password;

    private String mobileNo;

    private String address;
    private int twowheelers;
    private int fourwheelers;
    private int hmv;


    public Vendor(){

    }

    public Vendor(int id, String name, String email, String password, String mobileNo, String address, int twowheelers, int fourwheelers, int hmv) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobileNo = mobileNo;
        this.address = address;
        this.twowheelers = twowheelers;
        this.fourwheelers= fourwheelers;
        this.hmv = hmv;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTwowheelers() {
        return twowheelers;
    }

    public void setTwowheelers(int twowheelers) {
        this.twowheelers = twowheelers;
    }

    public int getFourwheelers() {
        return fourwheelers;
    }

    public void setFourwheelers(int fourwheelers) {
        this.fourwheelers = fourwheelers;
    }

    public int getHmv() {
        return hmv;
    }

    public void setHmv(int hmv) {
        this.hmv = hmv;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address='" + address + '\'' +
                ", twowheelers=" + twowheelers +
                ", fourwheelers=" + fourwheelers +
                ", hmv=" + hmv +
                '}';
    }
}

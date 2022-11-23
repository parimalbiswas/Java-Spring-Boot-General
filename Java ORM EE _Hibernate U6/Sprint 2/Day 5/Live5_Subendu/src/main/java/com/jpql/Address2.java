package com.jpql;

import java.util.Objects;

public class Address2 {
    private  String city;
    private  String state;
    private  String pincode;

    private  String type;


//    public Address(String city, String state, String pincode) {
//        this.city = city;
//        this.state = state;
//        this.pincode = pincode;
//    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address2{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Address2(String city, String state, String pincode, String type) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.type = type;
    }

    public Address2() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address2 address2 = (Address2) o;
        return Objects.equals(city, address2.city) && Objects.equals(state, address2.state) && Objects.equals(pincode, address2.pincode) && Objects.equals(type, address2.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, pincode, type);
    }
}

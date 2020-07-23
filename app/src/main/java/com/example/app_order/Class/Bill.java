package com.example.app_order.Class;

import java.util.List;

public class Bill {

    private String date;
    private String name;
    private String phoneNumber;
    private List<Food> foodList;

    public Bill(String date, String name, String phoneNumber, List<Food> foodList) {
        this.date = date;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.foodList = foodList;
    }

    public Bill() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public int Total(){

        int total = 0;
        for (int i = 0; i < foodList.size() ; i++) {
            total += foodList.get(i).TotalPrice();
        }
        return total;
    }

}

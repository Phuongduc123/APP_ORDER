package com.example.app_order.Class;

public class Food {

    private String name;
    private int image;
    private String describe;
    private int amount;
    private int price;
    private String status;


    public Food() {
    }

    public Food(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public Food(String name, int image, String describe, int amount, int price, String status) {
        this.name = name;
        this.image = image;
        this.describe = describe;
        this.amount = amount;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int TotalPrice(){
        return amount*price;
    }
}

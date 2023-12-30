package com.example.foodapp.Model;

public class SmallRecModel {
    private int item_image;
    private int item_name;
    private int item_des;
    private int item_price;
    private int item_rate;

    public SmallRecModel(int item_image, int item_name, int item_des, int item_price, int item_rate) {
        this.item_image = item_image;
        this.item_name = item_name;
        this.item_des = item_des;
        this.item_price = item_price;
        this.item_rate = item_rate;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public int getItem_name() {
        return item_name;
    }

    public void setItem_name(int item_name) {
        this.item_name = item_name;
    }

    public int getItem_des() {
        return item_des;
    }

    public void setItem_des(int item_des) {
        this.item_des = item_des;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getItem_rate() {
        return item_rate;
    }

    public void setItem_rate(int item_rate) {
        this.item_rate = item_rate;
    }
}

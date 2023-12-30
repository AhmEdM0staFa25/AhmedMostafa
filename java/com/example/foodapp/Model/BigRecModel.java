package com.example.foodapp.Model;

public class BigRecModel {
    private int item_image;
    private int item_title;
    private int item_del_price;
    private int item_del_time;
    private int item_type1;
    private int item_type2;
    private int item_rate;
    private int item_price;

    public BigRecModel(int item_image, int item_title, int item_del_price, int item_del_time, int item_type1, int item_type2, int item_rate, int item_price) {
        this.item_image = item_image;
        this.item_title = item_title;
        this.item_del_price = item_del_price;
        this.item_del_time = item_del_time;
        this.item_type1 = item_type1;
        this.item_type2 = item_type2;
        this.item_rate = item_rate;
        this.item_price = item_price;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public int getItem_title() {
        return item_title;
    }

    public void setItem_title(int item_title) {
        this.item_title = item_title;
    }

    public int getItem_del_price() {
        return item_del_price;
    }

    public void setItem_del_price(int item_del_price) {
        this.item_del_price = item_del_price;
    }

    public int getItem_del_time() {
        return item_del_time;
    }

    public void setItem_del_time(int item_del_time) {
        this.item_del_time = item_del_time;
    }

    public int getItem_type1() {
        return item_type1;
    }

    public void setItem_type1(int item_type1) {
        this.item_type1 = item_type1;
    }

    public int getItem_type2() {
        return item_type2;
    }

    public void setItem_type2(int item_type2) {
        this.item_type2 = item_type2;
    }

    public int getItem_rate() {
        return item_rate;
    }

    public void setItem_rate(int item_rate) {
        this.item_rate = item_rate;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }
}

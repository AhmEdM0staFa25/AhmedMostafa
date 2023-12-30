package com.example.foodapp.Model;

public class LargeRecModel {
    private int item_image;
    private int item_name;
    private int item_del;
    private int item_del_time;
    private int item_type1;
    private int item_type2;
    private int item_type3;
    private int item_rate;


    public LargeRecModel(int item_image, int item_name, int item_del, int item_del_time, int item_type1, int item_type2, int item_type3, int item_rate) {
        this.item_image = item_image;
        this.item_name = item_name;
        this.item_del = item_del;
        this.item_del_time = item_del_time;
        this.item_type1 = item_type1;
        this.item_type2 = item_type2;
        this.item_type3 = item_type3;
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

    public int getItem_del() {
        return item_del;
    }

    public void setItem_del(int item_del) {
        this.item_del = item_del;
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

    public int getItem_type3() {
        return item_type3;
    }

    public void setItem_type3(int item_type3) {
        this.item_type3 = item_type3;
    }

    public int getItem_rate() {
        return item_rate;
    }

    public void setItem_rate(int item_rate) {
        this.item_rate = item_rate;
    }

}

package com.example.myapplication.model.entity;

public class Cinema {
    private Integer id;
    private String location;
    private String title;
    private String tel;
    private boolean refund;
    private boolean change_time;
    private boolean snack;
    private boolean three_D_glasses;
    private boolean wifi;
    private boolean rest_area;
    private boolean children_discount;

    public Cinema(){

    }
    public Cinema(Integer id, String location, String title, String tel, boolean refund, boolean change_time, boolean snack, boolean three_D_glasses, boolean wifi, boolean rest_area, boolean children_discount) {
        this.id = id;
        this.location = location;
        this.title = title;
        this.tel = tel;
        this.refund = refund;
        this.change_time = change_time;
        this.snack = snack;
        this.three_D_glasses = three_D_glasses;
        this.wifi = wifi;
        this.rest_area = rest_area;
        this.children_discount = children_discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isRefund() {
        return refund;
    }

    public void setRefund(boolean refund) {
        this.refund = refund;
    }

    public boolean isChange_time() {
        return change_time;
    }

    public void setChange_time(boolean change_time) {
        this.change_time = change_time;
    }

    public boolean isSnack() {
        return snack;
    }

    public void setSnack(boolean snack) {
        this.snack = snack;
    }

    public boolean isThree_D_glasses() {
        return three_D_glasses;
    }

    public void setThree_D_glasses(boolean three_D_glasses) {
        this.three_D_glasses = three_D_glasses;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isRest_area() {
        return rest_area;
    }

    public void setRest_area(boolean rest_area) {
        this.rest_area = rest_area;
    }

    public boolean isChildren_discount() {
        return children_discount;
    }

    public void setChildren_discount(boolean children_discount) {
        this.children_discount = children_discount;
    }
}

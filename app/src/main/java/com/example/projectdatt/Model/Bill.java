package com.example.projectdatt.Model;

import java.util.List;

public class Bill {
    private String id;
    private String id_user;
    private String username;
    private String phone;
    private String location;
    private String paymethod;

    private List<ProductsAddCart> cartList;
    private int totalprice;
    private String order_status;
    private boolean discountUsed = false;
    private String date;
    public Bill() {
    }


    public Bill(String id_user, String username, String phone, String location, String paymethod,String order_status, List<ProductsAddCart> cartList, int totalprice, String date) {
        this.id_user = id_user;
        this.username = username;
        this.phone = phone;
        this.location = location;
        this.order_status = order_status;
        this.paymethod = paymethod;
        this.cartList = cartList;
        this.totalprice = totalprice;
        this.date = date;
    }

    public Bill(String id, String id_user, String username, String phone, String location, String paymethod, List<ProductsAddCart> cartList, int totalprice, String order_status, boolean discountUsed,String date) {
        this.id = id;
        this.id_user = id_user;
        this.username = username;
        this.phone = phone;
        this.location = location;
        this.paymethod = paymethod;
        this.cartList = cartList;
        this.totalprice = totalprice;
        this.order_status = order_status;
        this.discountUsed = discountUsed;
        this.date = date;
    }

    public boolean isDiscountUsed() {
        return discountUsed;
    }

    public void setDiscountUsed(boolean discountUsed) {
        this.discountUsed = discountUsed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ProductsAddCart> getCartList() {
        return cartList;
    }

    public void setCartList(List<ProductsAddCart> cartList) {
        this.cartList = cartList;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

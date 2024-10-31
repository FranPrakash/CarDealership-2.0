package com.yearup.dealership;

public abstract class Contract {

    //Properties
    private String contractDate;
    private String customerName;
    private String customerEmail;
    private Integer vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

//Constructor
    public Contract(String contractdate, String customerEmail, String customerName, double monthlyPayment, double totalPrice, Integer vehicleSold) {
        this.contractDate = contractdate;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.monthlyPayment = monthlyPayment;
        this.totalPrice = totalPrice;
        this.vehicleSold = vehicleSold;
    }

    //Getters and Setters

    public String getContractDate() {
        return contractDate;
    }

    public void setContractdate(String contractdate) {
        this.contractDate = contractdate;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Integer vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

//Abstract methods

    public abstract double getMonthlyPayment();

    public abstract double getTotalPrice();

}

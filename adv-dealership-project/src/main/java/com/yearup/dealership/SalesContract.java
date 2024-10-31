package com.yearup.dealership;

public class SalesContract extends Contract {

    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean isFinanced;

    //Super Constructor
    public SalesContract(String contractDate, String customerEmail, String customerName, double monthlyPayment, double totalPrice, Integer vehicleSold, boolean isFinanced, double processingFee, double recordingFee, double salesTaxAmount) {
        super(contractDate, customerEmail, customerName, monthlyPayment, totalPrice, vehicleSold);
        this.isFinanced = isFinanced;
        this.processingFee = processingFee;
        this.recordingFee = recordingFee; //$100
        this.salesTaxAmount = salesTaxAmount; //0.05(5%)
    }

    //Getters and Setters
    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }


    //TODO: Override methods
    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}

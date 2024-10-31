package com.yearup.dealership;

public class SalesContract extends Contract {

    //Phase 1 Contract
    private final double salesTaxAmount = 0.05;
    private final double recordingFee = 100;
    private double processingFee;
    private boolean isFinanced;

    //Super Constructor
    public SalesContract(String contractDate, String customerEmail, String customerName, double monthlyPayment, double totalPrice, Integer vehicleSold, boolean isFinanced, double processingFee)

     {
        super(contractDate, customerEmail, customerName, monthlyPayment, totalPrice, vehicleSold);
        this.isFinanced = isFinanced;
        this.processingFee = processingFee;

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

    public double getSalesTaxAmount() {
        return salesTaxAmount;
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

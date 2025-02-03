package com.zifan.atmsystem.models;


/**
 * 2025, February 03, Monday, 5:16 PM
 */

public class Transfer extends Transaction {
    private String destinationAccountNumber;
    private String sourceAccountNumber;

    private double amount;

    public double getAmount() {
        return amount;
    }
}

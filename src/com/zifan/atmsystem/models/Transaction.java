package com.zifan.atmsystem.models;


import com.zifan.atmsystem.enums.TransactionStatus;

import java.util.Date;

/**
 * 2025, February 03, Monday, 5:03 PM
 */

public class Transaction {
    private int transactionId;
    private TransactionStatus status;
    private Date creationDate;

    private Account account;
    private ATM atm;

    public boolean saveTransaction() {
        return false;
    }
}

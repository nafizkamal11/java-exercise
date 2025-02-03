package com.zifan.atmsystem.models;


import com.zifan.atmsystem.enums.CustomerStatus;

import java.util.List;

/**
 * 2025, February 03, Monday, 2:23 PM
 */

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;

    private List<Account> accountList;
    private Card card;

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public boolean makeTransaction() {
        return false;
    }
}

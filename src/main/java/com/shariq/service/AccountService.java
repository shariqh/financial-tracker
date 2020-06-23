package com.shariq.service;

import com.shariq.model.Account;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class AccountService {

    public Account getAccount() {
        Account account = new Account();
        account.setAccountName("BoA");
        account.setBalance(100.11);
        account.setDate(new Date());

        return account;
    }
}

package com.bankApp.userFront.service;

import com.bankApp.userFront.domain.PrimaryAccount;
import com.bankApp.userFront.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
}

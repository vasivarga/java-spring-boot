package com.bankApp.userFront.service;

import com.bankApp.userFront.domain.PrimaryAccount;
import com.bankApp.userFront.domain.SavingsAccount;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
}

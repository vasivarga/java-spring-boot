package com.bankApp.userFront.service.UserServiceImpl;

import com.bankApp.userFront.dao.PrimaryAccountDao;
import com.bankApp.userFront.dao.SavingsAccountDao;
import com.bankApp.userFront.domain.PrimaryAccount;
import com.bankApp.userFront.domain.SavingsAccount;
import com.bankApp.userFront.service.AccountService;
import com.bankApp.userFront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    private static int nextAccountNumber = 11223145;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private UserService userService;

    @Override
    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal("0.0"));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal("0.0"));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }

    private int accountGen(){
        return ++nextAccountNumber;
    }

}

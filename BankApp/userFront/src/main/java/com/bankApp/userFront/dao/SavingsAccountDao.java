package com.bankApp.userFront.dao;

import com.bankApp.userFront.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

public interface SavingsAccountDao  extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}

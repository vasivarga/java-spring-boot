package com.bankApp.userFront.dao;

import com.bankApp.userFront.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}

package com.bankApp.userFront.dao;

import com.bankApp.userFront.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao  extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}

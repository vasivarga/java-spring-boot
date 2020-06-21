package com.bankApp.userFront.service;

import com.bankApp.userFront.domain.User;
import com.bankApp.userFront.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);
    boolean checkUserExists(String username, String email);
    boolean checkEmailExists(String email);
    boolean checkUsernameExists(String username);
    void save (User user);

    User createUser(User user, Set<UserRole> userRoles);
}

package com.test.dao;

import com.test.model.User;

import java.util.List;

public interface IUser {
    List<User> getAllUsers();
    User getUserByEmail(String nEmail);
}

package com.test.dao.impl;

import com.test.dao.IUser;
import com.test.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements IUser {
    private List<User> Users = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return Users;
    }

    @Override
    public User getUserByEmail(String nEmail) {
        for (User u: Users) {
            if (u.getEmail().equals(nEmail)){
                return u;
            }
        }
        return null;
    }

    @Override
    public void createNewUser(String name, String lastName, String fName, String email) {
        User tempUser = new User();
        tempUser.setFirstName(name);
        tempUser.setLastName(lastName);
        tempUser.setFatherName(fName);
        tempUser.setEmail(email);
        Users.add(tempUser);
    }
}

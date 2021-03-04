package com.test;

import com.test.dao.impl.UserDAOImpl;
import com.test.model.User;

public class Realise {

    private static UserDAOImpl userDAO = new UserDAOImpl();
    public static void main(String[] args){
        System.out.println("Hello WORLD!");
        User user = new User();
        userDAO.createNewUser("djfkd", "kdjf", "jdhfjhd", "kjdhf");
    }
}

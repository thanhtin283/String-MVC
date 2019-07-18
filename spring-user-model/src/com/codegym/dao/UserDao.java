package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Tin");
        u1.setAccount("tin");
        u1.setEmail("tin123@gmail.com");
        u1.setPassword("tin123");
        users.add(u1);

        User u2= new User("hoang","123","Hoang","hoang123@gmail.com",15);
        users.add(u2);
    }
    public static User checkLogin(Login login){
        for (User u:users){
            if (u.getAccount().equals(login.getAccount())
                && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}

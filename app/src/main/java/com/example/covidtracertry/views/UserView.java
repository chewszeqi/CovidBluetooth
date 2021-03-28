package com.example.covidtracertry.views;

import com.example.covidtracertry.models.User;

public class UserView {
    public static void printUser(User user) {
        System.out.println(user.phone);
        System.out.println(user.status);
    }
}

package com.gg.codearena;

public class User {
    private String userName;
    private String userID;

    public User(String name, String userID){
        this.userName = name;
        this.userID = userID;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserID(){
        return userID;
    }
}

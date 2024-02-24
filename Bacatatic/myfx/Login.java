package com.example.myfx;

public class Login {
    private String username= "Admin";
    private static String id="911911";
    private static String password="Admin";
    private  static  String security="Ash";

    public static String getSecurity() {
        return security;
    }

    public static void setSecurity(String security) {
        Login.security = security;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }
    public  static  void changepassword(String newPass){
        if (id=="911911"&&  newPass.length()==10){
            password=newPass;
        }

    }
}

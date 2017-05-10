package com.jzf.mybatis.pojo;

/**
 * Created by Administrator on 2017/5/9.
 */
public class User {
    private int id;
    private String username;
    private String password;
    private double account;

    public User(String userName, String password, Double account) {
        this.username = userName;
        this.password = password;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}

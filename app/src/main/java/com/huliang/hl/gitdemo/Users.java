package com.huliang.hl.gitdemo;

/**
 * Created by hl on 2016/11/18.
 */

public class Users {

    private String userName;
    private String passWord;
    private int age;

    public Users() {
    }

    public Users(String userName, String passWord, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}

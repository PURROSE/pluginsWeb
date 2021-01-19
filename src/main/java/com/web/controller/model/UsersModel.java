package com.web.controller.model;

public class UsersModel {
    private String userId;
    private String userName;
    private String userPhone;
    private String userEmail;
    private String userLevel;
    private String userState;

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserState() {
        return userState;
    }
}

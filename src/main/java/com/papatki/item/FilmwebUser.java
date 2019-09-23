package com.papatki.item;

public class FilmwebUser {

    private String name;
    private String userName;

    public FilmwebUser(String name, String userName) {
        this.name = name;
        this.userName = userName;

    }

    public FilmwebUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

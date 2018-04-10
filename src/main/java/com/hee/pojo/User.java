package com.hee.pojo;

/**
 * @author hee
 * @version 1.0
 * @description pojo
 * @date 2018/4/9
 */
public class User {

    private int id;
    private String name;
    private int password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", password=" + password + '}';
    }
}

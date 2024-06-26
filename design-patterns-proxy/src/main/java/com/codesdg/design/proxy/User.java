package com.codesdg.design.proxy;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:32
 * @description
 * @Copyright
 */
public class User {

    private String name;

    private Boolean isAdmin;

    public User(String name, Boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public boolean isAuthenticated() {
        return isAdmin;
    }
}

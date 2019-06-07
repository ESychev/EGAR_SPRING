package com.egar.myShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Lenovo
 *
 */

@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id
    @Column(name = "u_user_id", length = 20, nullable = false)
    private long userId;
    @Column(name = "u_user_login", length = 20, nullable = false)
    private String userLogin;
    @Column(name = "u_user_password", length = 20, nullable = false)
    private String userPassword;

    /**
     *
     */
    public User() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userId
     * @param userLogin
     * @param userPassword
     */
    public User(long userId, String userLogin, String userPassword) {
        super();
        this.userId = userId;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    /**
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * @return the userLogin
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * @param userLogin the userLogin to set
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userLogin=" + userLogin + ", userPassword=" + userPassword
                + ", getUserId()=" + getUserId() + ", getUserLogin()=" + getUserLogin() + ", getUserPassword()="
                + getUserPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
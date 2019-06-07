package com.egar.myShop.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Lenovo
 *
 */

@Entity
@Table(name = "Role")
public class Role implements Serializable {

    @Id
    @Column(name = "r_role_id", length = 20, nullable = false)
    private long roleId;
    @Column(name = "r_role_name", length = 20, nullable = false)
    private String userLogin;

    @OneToOne(cascade = CascadeType.ALL)
    @Column(name = "p_permission_id", length = 20, nullable = false)
    private Permission permission;
    private long permissionId;

    @Column(name = "u_user_id", length = 20, nullable = false)
    private long userId;

    /**
     *
     */
    public Role() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the roleId
     */
    public long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(long roleId) {
        this.roleId = roleId;
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
     * @return the permissionId
     */
    public long getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId the permissionId to set
     */
    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
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
     * @param roleId
     * @param userLogin
     * @param permissionId
     * @param userId
     */
    public Role(long roleId, String userLogin, long permissionId, long userId) {
        super();
        this.roleId = roleId;
        this.userLogin = userLogin;
        this.permissionId = permissionId;
        this.userId = userId;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Role [roleId=" + roleId + ", userLogin=" + userLogin + ", permissionId=" + permissionId + ", userId="
                + userId + ", getRoleId()=" + getRoleId() + ", getUserLogin()=" + getUserLogin()
                + ", getPermissionId()=" + getPermissionId() + ", getUserId()=" + getUserId() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}


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
@Table(name = "Permission")
public class Permission implements Serializable {

    @Id
    @Column(name = "p_permission_id", length = 20, nullable = false)
    private long permissionId;

    @Column(name = "p_permission_name", length = 20, nullable = false)
    private String permissionName;

    /**
     *
     */
    public Permission() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param permissionId
     * @param permissionName
     */
    public Permission(long permissionId, String permissionName) {
        super();
        this.permissionId = permissionId;
        this.permissionName = permissionName;
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
     * @return the permissionName
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * @param permissionName the permissionName to set
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Permission [permissionId=" + permissionId + ", permissionName=" + permissionName + "]";
    }

}
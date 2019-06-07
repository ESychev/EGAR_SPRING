package com.egar.myShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Deliverytype")
public class Deliverytype implements Serializable {

    @Id
    @Column(name = "d_deliverytype_id", length = 20, nullable = false)
    private long deliverytypeId;

    @Column(name = "d_deliverytype_name", length = 20, nullable = false)
    private String deliverytypeName;

    /**
     *
     */
    public Deliverytype() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the deliverytypeId
     */
    public long getDeliverytypeId() {
        return deliverytypeId;
    }

    /**
     * @param deliverytypeId the deliverytypeId to set
     */
    public void setDeliverytypeId(long deliverytypeId) {
        this.deliverytypeId = deliverytypeId;
    }

    /**
     * @return the deliverytypeName
     */
    public String getDeliverytypeName() {
        return deliverytypeName;
    }

    /**
     * @param deliverytypeName the deliverytypeName to set
     */
    public void setDeliverytypeName(String deliverytypeName) {
        this.deliverytypeName = deliverytypeName;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Deliverytype [deliverytypeId=" + deliverytypeId + ", deliverytypeName=" + deliverytypeName
                + ", getDeliverytypeId()=" + getDeliverytypeId() + ", getDeliverytypeName()=" + getDeliverytypeName()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

}

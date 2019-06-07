package com.egar.myShop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Basket")
public class Basket implements Serializable {

    @Id
    @Column(name = "b_basket_id", length = 20, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long basketId;

    @Column(name = "u_user_id", length = 20, nullable = false)
    private long userId;

    /**
     *
     */
    public Basket() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the basketId
     */
    public long getBasketId() {
        return basketId;
    }

    /**
     * @param basketId the basketId to set
     */
    public void setBasketId(long basketId) {
        this.basketId = basketId;
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
     * @param basketId
     * @param userId
     */
    public Basket(long basketId, long userId) {
        super();
        this.basketId = basketId;
        this.userId = userId;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Basket [basketId=" + basketId + ", userId=" + userId + ", getBasketId()=" + getBasketId()
                + ", getUserId()=" + getUserId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}
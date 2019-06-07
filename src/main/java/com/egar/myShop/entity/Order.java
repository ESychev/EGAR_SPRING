package com.egar.myShop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "Order")
public class Order implements Serializable {

    @Id
    @Column(name = "o_order_id", length = 20, nullable = false)
    private long orderId;

    @Column(name = "u_user_id", length = 20, nullable = false)
    private long userId;

    @OneToOne(cascade = CascadeType.ALL)
    @Column(name = "d_deliverytype_id", length = 20, nullable = false)
    private Deliverytype deliverytype;
    private long deliverytypeId;

    @Column(name = "p_price_product", length = 20, nullable = false)
    private long priceProduct;

    @Column(name = "o_quantity", length = 20, nullable = false)
    private long quantity;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "o_order_date", length = 20, nullable = false)
    private Date orderDate;

    /**
     *
     */
    public Order() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the orderId
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
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
     * @return the priceProduct
     */
    public long getPriceProduct() {
        return priceProduct;
    }

    /**
     * @param priceProduct the priceProduct to set
     */
    public void setPriceProduct(long priceProduct) {
        this.priceProduct = priceProduct;
    }

    /**
     * @return the quantity
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @param orderId
     * @param userId
     * @param deliverytypeId
     * @param priceProduct
     * @param quantity
     * @param orderDate
     */
    public Order(long orderId, long userId, long deliverytypeId, long priceProduct, long quantity, Date orderDate) {
        super();
        this.orderId = orderId;
        this.userId = userId;
        this.deliverytypeId = deliverytypeId;
        this.priceProduct = priceProduct;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", userId=" + userId + ", deliverytypeId=" + deliverytypeId
                + ", priceProduct=" + priceProduct + ", quantity=" + quantity + ", orderDate=" + orderDate
                + ", getOrderId()=" + getOrderId() + ", getUserId()=" + getUserId() + ", getDeliverytypeId()="
                + getDeliverytypeId() + ", getPriceProduct()=" + getPriceProduct() + ", getQuantity()=" + getQuantity()
                + ", getOrderDate()=" + getOrderDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}

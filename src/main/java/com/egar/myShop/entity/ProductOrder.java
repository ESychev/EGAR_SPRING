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
@Table(name = "m2m_product_order")
public class ProductOrder implements Serializable {

    @Id
    @Column(name = "m2m_product_order_id", length = 20, nullable = false)
    private long productOrderId;

    @Column(name = "p_product_id", length = 20, nullable = false)
    private long productId;

    @Column(name = "o_order_id", length = 20, nullable = false)
    private long orderId;

    /**
     *
     */
    public ProductOrder() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the productOrderId
     */
    public long getProductOrderId() {
        return productOrderId;
    }

    /**
     * @param productOrderId the productOrderId to set
     */
    public void setProductOrderId(long productOrderId) {
        this.productOrderId = productOrderId;
    }

    /**
     * @return the productId
     */
    public long getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(long productId) {
        this.productId = productId;
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
     * @param productOrderId
     * @param productId
     * @param orderId
     */
    public ProductOrder(long productOrderId, long productId, long orderId) {
        super();
        this.productOrderId = productOrderId;
        this.productId = productId;
        this.orderId = orderId;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ProductOrder [productOrderId=" + productOrderId + ", productId=" + productId + ", orderId=" + orderId
                + ", getProductOrderId()=" + getProductOrderId() + ", getProductId()=" + getProductId()
                + ", getOrderId()=" + getOrderId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}
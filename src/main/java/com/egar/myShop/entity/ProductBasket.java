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
@Table(name = "m2m_product_basket")
public class ProductBasket implements Serializable {

    @Id
    @Column(name = "m2m_product_basket_id", length = 20, nullable = false)
    private long productBasketId;

    @Column(name = "p_product_id", length = 20, nullable = false)
    private long productId;

    @Column(name = "b_basket_id", length = 20, nullable = false)
    private long basketId;

    /**
     *
     */
    public ProductBasket() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the productBasketId
     */
    public long getProductBasketId() {
        return productBasketId;
    }

    /**
     * @param productBasketId the productBasketId to set
     */
    public void setProductBasketId(long productBasketId) {
        this.productBasketId = productBasketId;
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
     * @param productBasketId
     * @param productId
     * @param basketId
     */
    public ProductBasket(long productBasketId, long productId, long basketId) {
        super();
        this.productBasketId = productBasketId;
        this.productId = productId;
        this.basketId = basketId;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ProductBasket [productBasketId=" + productBasketId + ", productId=" + productId + ", basketId="
                + basketId + ", getProductBasketId()=" + getProductBasketId() + ", getProductId()=" + getProductId()
                + ", getBasketId()=" + getBasketId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}
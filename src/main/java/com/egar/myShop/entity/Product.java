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
@Table(name = "Product")
public class Product implements Serializable {

    @Id
    @Column(name = "p_product_id", length = 20, nullable = false)
    private long productId;

    @Column(name = "p_product_name", length = 20, nullable = false)
    private String productName;

    @Column(name = "p_price_product", length = 20, nullable = false)
    private long priceProduct;

    /**
     *
     */
    public Product() {
        // TODO Auto-generated constructor stub
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
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
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

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", priceProduct=" + priceProduct
                + ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
                + ", getPriceProduct()=" + getPriceProduct() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

}

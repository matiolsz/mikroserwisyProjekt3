package com.matimicroservices.productstockservice.productstockservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ProductStock {

    @Id
    @Column(name = "product_id")
    private Long productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private BigDecimal productPrice;

    @Column(name="product_availability")
    private String productAvailability;

    @Column(name = "product_discountoffer")
    private double discountOffer;

    public ProductStock() {
    }


    public Long getId() {
        return productId;
    }

    public void setId(Long id) {
        this.productId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public double getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(double discountOffer) {
        this.discountOffer = discountOffer;
    }
}

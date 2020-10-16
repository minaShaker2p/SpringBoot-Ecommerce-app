package com.mina.springbootecommerceapp.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "orders_details")
@Data
public class OrderDetailsEntity {

    @Id
    @Column(name = "order_details_id")
    private long orderDetailsId;

    @NonNull
    @Column(name = "order_price")
    private double orderPrice;

    @Column(name = "order_discount")
    private double orderDiscount;
    @NonNull
    @Column(name = "order_total_price")
    private double orderTotalPrice;
}

package com.mina.springbootecommerceapp.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "orders")
@Data
public class OrderEntity {
    @Id
    @Column(name = "order_id")
    private long orderId;

    @NotNull
    @Column(name = "order_number")
    private String orderNumber;

}

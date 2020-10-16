package com.mina.springbootecommerceapp.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Suppliers")
@Data
public class SupplierEntity {
    @Id
    @Column(name = "supplier_id")
    private long supplierId;

    @NonNull
    @Column(name = "company_name")
    private String companyName;

    @NotNull
    @Column(name = "company_address")
    private String companyAddress;

    @NotNull
    @Column(name = "company_phone")
    private String companyPhone;
}

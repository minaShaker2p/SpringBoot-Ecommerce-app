package com.mina.springbootecommerceapp.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
@Data
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long categoryId;

    @NonNull
    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_desc")
    private String categoryDesc;
}

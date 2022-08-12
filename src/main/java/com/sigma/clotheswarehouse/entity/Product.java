package com.sigma.clotheswarehouse.entity;

import com.sigma.clotheswarehouse.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends AbsEntity {

    private String model;

    private String code;

    private String color;

    private double seriaAmount;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    private Measurement measurement;

    @ManyToOne
    private Category category;

    @Column(nullable = false)
    private boolean deleted = false;
}

package com.sigma.clotheswarehouse.entity;

import com.sigma.clotheswarehouse.entity.template.AbsLong;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Measurement extends AbsLong {
    private String name;
}

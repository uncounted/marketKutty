package com.marketkutty.marketkutty.entity;

import com.marketkutty.marketkutty.entity.baseEntity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRODUCT_ID")
    private Long id;

    @NotNull
    private int categoryCode; //001001

    @NotNull
    private String name;

    @NotNull
    private int price;

    @NotNull
    private String summary;

    @NotNull
    private String thumb;
}

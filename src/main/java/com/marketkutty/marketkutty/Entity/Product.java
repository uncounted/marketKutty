package com.marketkutty.marketkutty.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.marketkutty.marketkutty.Entity.BaseEntity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

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

package com.marketkutty.marketkutty.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ADDRESS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    @JsonBackReference(value="address-user-fk")
    private User user;

    @NotNull
    private String address;

    @NotNull
    private String addressDetail;

    @NotNull
    private String zoneNo;

    @NotNull
    private Boolean defaultAddress;

    public Address(Long id, String address, String addressDetail, String zoneNo, Boolean defaultAddress) {
        this.id = id;
        this.address = address;
        this.addressDetail = addressDetail;
        this.zoneNo = zoneNo;
        this.defaultAddress = defaultAddress;
    }
}

package com.clone.kream.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "wish_items")
public class WishItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wish_item_id")
    private Long wishItemId;

    @Column(name = "wish_item_image", nullable = false, length = 1000)
    private String wishItemImage;

    @Column(name = "wish_item_nm", nullable = false, length = 200)
    private String wishItemName;

    @Column(name = "wish_item_url", nullable = false, length = 1000)
    private String wishItemUrl;

    @Column(name = "wish_item_price")
    private Long wishItemPrice;

    @Column(name = "wish_discount_percent")
    private Long wishDiscountPercent;
}

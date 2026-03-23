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
@Table(name = "select_brand_item")
public class SelectBrandItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "select_brand_item_id")
    private Long selectBrandItemId;

    @Column(name = "select_brand_item_nm", length = 200)
    private String selectBrandItemName;

    @Column(name = "select_brand_item_image", nullable = false, length = 1000)
    private String selectBrandItemImage;

    @Column(name = "select_brand_item_url", nullable = false, length = 1000)
    private String selectBrandItemUrl;

    @Column(name = "select_brand_item_discount_percent")
    private Long selectBrandItemDiscountPercent;
}

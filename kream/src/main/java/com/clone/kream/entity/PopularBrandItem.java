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
@Table(name = "popular_brand_item")
public class PopularBrandItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "popular_brand_item_id")
    private Long popularBrandItemId;

    @Column(name = "popular_brand_item_nm", nullable = false, length = 200)
    private String popularBrandItemName;

    @Column(name = "popular_brand_item_price")
    private Long popularBrandItemPrice;

    @Column(name = "popular_brand_item_discount_percent")
    private Long popularBrandItemDiscountPercent;

    @Column(name = "popular_brand_item_interest")
    private Long popularBrandItemInterest;

    @Column(name = "popular_brand_item_review")
    private Long popularBrandItemReview;

    @Column(name = "popular_brand_item_item_image", nullable = false, length = 1000)
    private String popularBrandItemImage;

    @Column(name = "popular_brand_item_url", nullable = false, length = 1000)
    private String popularBrandItemUrl;

    @Column(name = "popular_brand_keyward_id")
    private Long popularBrandKeywardId;
}

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
@Table(name = "most_popular_item")
public class MostPopularItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "most_popular_item_id")
    private Long mostPopularItemId;

    @Column(name = "most_popular_item_nm", nullable = false, length = 200)
    private String mostPopularItemName;

    @Column(name = "most_popular_item_price")
    private Long mostPopularItemPrice;

    @Column(name = "most_popular_item_discount_percent")
    private Long mostPopularItemDiscountPercent;

    @Column(name = "most_popular_item_interest")
    private Long mostPopularItemInterest;

    @Column(name = "most_popular_item_review")
    private Long mostPopularItemReview;

    @Column(name = "most_popular_item_image", nullable = false, length = 1000)
    private String mostPopularItemImage;

    @Column(name = "most_popular_item_url", nullable = false, length = 1000)
    private String mostPopularItemUrl;
}

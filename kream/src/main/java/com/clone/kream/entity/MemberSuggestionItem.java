package com.clone.kream.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "member_suggestion_item")
public class MemberSuggestionItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_suggestion_item_id")
    private Long memberSuggestionItemId;

    @Column(name = "member_suggestion_brand", nullable = false, length = 200)
    private String memberSuggestionBrand;

    @Column(name = "member_suggestion_item_nm", nullable = false, length = 200)
    private String memberSuggestionItemName;

    @Column(name = "member_suggestion_item_price")
    private Long memberSuggestionItemPrice;

    @Column(name = "member_suggestion_item_discount_percent")
    private Long memberSuggestionItemDiscountPercent;

    @Column(name = "member_suggestion_item_interest")
    private Long memberSuggestionItemInterest;

    @Column(name = "member_suggestion_item_review")
    private Long memberSuggestionItemReview;

    @Column(name = "member_suggestion_item_trade")
    private Long memberSuggestionItemTrade;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_suggestion_item_delivery")
    private DeliveryType memberSuggestionItemDelivery;

    @Column(name = "member_suggestion_item_delivery_desc", length = 200)
    private String memberSuggestionItemDeliveryDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_suggestion_item_coupon")
    private YnType memberSuggestionItemCoupon;

    @Column(name = "member_suggestion_item_coupon_desc", length = 200)
    private String memberSuggestionItemCouponDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_suggestion_item_point")
    private YnType memberSuggestionItemPoint;

    @Column(name = "member_suggestion_item_point_desc", length = 200)
    private String memberSuggestionItemPointDescription;

    @Column(name = "member_suggestion_item_item_image", nullable = false, length = 1000)
    private String memberSuggestionItemImage;

    @Column(name = "member_suggestion_item_url", nullable = false, length = 1000)
    private String memberSuggestionItemUrl;

    public enum DeliveryType {
        fast, free, basic
    }

    public enum YnType {
        Y, N
    }
}

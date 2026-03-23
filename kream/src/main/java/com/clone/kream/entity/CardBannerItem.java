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
@Table(name = "card_banner_item")
public class CardBannerItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_banner_item_id")
    private Long cardBannerItemId;

    @Column(name = "card_banner_item_nm", nullable = false, length = 200)
    private String cardBannerItemName;

    @Column(name = "card_banner_item_sub_nm", nullable = false, length = 200)
    private String cardBannerItemSubName;

    @Column(name = "card_banner_item_dec", nullable = false, length = 200)
    private String cardBannerItemDescription;

    @Column(name = "card_banner_item_image", nullable = false, length = 1000)
    private String cardBannerItemImage;

    @Column(name = "card_banner_url", nullable = false, length = 1000)
    private String cardBannerUrl;
}

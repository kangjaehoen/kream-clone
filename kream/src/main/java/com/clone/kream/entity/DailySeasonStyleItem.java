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
@Table(name = "daily_season_style_item")
public class DailySeasonStyleItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "daily_season_style_item_id")
    private Long dailySeasonStyleItemId;

    @Column(name = "daily_season_style_item_nm", nullable = false, length = 200)
    private String dailySeasonStyleItemName;

    @Column(name = "daily_season_style_item_price")
    private Long dailySeasonStyleItemPrice;

    @Column(name = "daily_season_style_item_discount_percent")
    private Long dailySeasonStyleItemDiscountPercent;

    @Column(name = "daily_season_style_item_image", nullable = false, length = 1000)
    private String dailySeasonStyleItemImage;

    @Column(name = "daily_season_style_item_sub_image", nullable = false, length = 1000)
    private String dailySeasonStyleItemSubImage;

    @Column(name = "daily_season_style_item_url", nullable = false, length = 1000)
    private String dailySeasonStyleItemUrl;
}

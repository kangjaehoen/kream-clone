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
@Table(name = "latest_trend_item")
public class LatestTrendItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "latest_trend_item_id")
    private Long latestTrendItemId;

    @Column(name = "latest_trend_item_nm", nullable = false, length = 200)
    private String latestTrendItemName;

    @Column(name = "latest_trend_item_sub_nm", nullable = false, length = 200)
    private String latestTrendItemSubName;

    @Column(name = "latest_trend_item_brand", nullable = false, length = 200)
    private String latestTrendItemBrand;

    @Column(name = "latest_trend_item_image", nullable = false, length = 1000)
    private String latestTrendItemImage;

    @Column(name = "latest_trend_item_url", nullable = false, length = 1000)
    private String latestTrendItemUrl;
}

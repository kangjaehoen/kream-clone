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
@Table(name = "hot_trend_item")
public class HotTrendItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hot_trand_item_id")
    private Long hotTrendItemId;

    @Column(name = "hot_trand_item_nm", nullable = false, length = 200)
    private String hotTrendItemName;

    @Column(name = "hot_trand_item_image", nullable = false, length = 1000)
    private String hotTrendItemImage;

    @Column(name = "hot_trand_item_url", length = 1000)
    private String hotTrendItemUrl;
}

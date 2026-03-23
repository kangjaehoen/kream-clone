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
@Table(name = "spotlight_items")
public class SpotlightItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spotlight_item_id")
    private Long spotlightItemId;

    @Column(name = "spotlight_item_image", nullable = false, length = 1000)
    private String spotlightItemImage;

    @Column(name = "spotlight_item_nm", nullable = false, length = 200)
    private String spotlightItemName;

    @Column(name = "spotlight_item_url", nullable = false, length = 1000)
    private String spotlightItemUrl;
}

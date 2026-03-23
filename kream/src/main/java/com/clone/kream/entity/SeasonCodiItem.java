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
@Table(name = "season_codi_item")
public class SeasonCodiItem extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "season_codi_item_id")
    private Long seasonCodiItemId;

    @Column(name = "season_codi_item_image", nullable = false, length = 1000)
    private String seasonCodiItemImage;

    @Column(name = "season_codi_item_url", nullable = false, length = 1000)
    private String seasonCodiItemUrl;
}

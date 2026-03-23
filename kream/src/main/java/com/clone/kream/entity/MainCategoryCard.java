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
@Table(name = "main_category_card")
public class MainCategoryCard extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "main_card_id")
    private Long mainCardId;

    @Column(name = "main_card_image", nullable = false, length = 1000)
    private String mainCardImage;

    @Column(name = "main_card_nm", nullable = false, length = 200)
    private String mainCardName;

    @Column(name = "main_card_url", nullable = false, length = 1000)
    private String mainCardUrl;
}

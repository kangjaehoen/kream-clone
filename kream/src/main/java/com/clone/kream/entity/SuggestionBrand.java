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
@Table(name = "suggestion_brand")
public class SuggestionBrand extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suggestion_brand_id")
    private Long suggestionBrandId;

    @Column(name = "suggestion_brand_nm", length = 200)
    private String suggestionBrandName;

    @Column(name = "suggestion_brand_image", nullable = false, length = 1000)
    private String suggestionBrandImage;

    @Column(name = "suggestion_brand_url", nullable = false, length = 1000)
    private String suggestionBrandUrl;
}

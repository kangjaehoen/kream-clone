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
@Table(name = "slide_banner")
public class SlideBanner extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banner_id")
    private Long bannerId;

    @Column(name = "banner_image", nullable = false, length = 1000)
    private String bannerImage;

    @Column(name = "banner_title", length = 300)
    private String bannerTitle;

    @Column(name = "banner_cn", length = 300)
    private String bannerContent;

    @Column(name = "banner_url", length = 1000)
    private String bannerUrl;
}

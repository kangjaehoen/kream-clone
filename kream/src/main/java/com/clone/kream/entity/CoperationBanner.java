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
@Table(name = "coperation_banner")
public class CoperationBanner extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coperation_banner_id")
    private Long coperationBannerId;

    @Column(name = "coperation_banner_first_image", nullable = false, length = 1000)
    private String coperationBannerFirstImage;

    @Column(name = "coperation_banner_second_image", nullable = false, length = 1000)
    private String coperationBannerSecondImage;

    @Column(name = "coperation_banner_title", length = 300)
    private String coperationBannerTitle;

    @Column(name = "coperation_banner_cn", length = 300)
    private String coperationBannerContent;

    @Column(name = "coperation_banner_url", length = 1000)
    private String coperationBannerUrl;
}

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
@Table(name = "running_banner")
public class RunningBanner extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "running_banner_id")
    private Long runningBannerId;

    @Column(name = "running_banner_first_image", nullable = false, length = 1000)
    private String runningBannerFirstImage;

    @Column(name = "running_banner_second_image", nullable = false, length = 1000)
    private String runningBannerSecondImage;

    @Column(name = "running_banner_title", length = 300)
    private String runningBannerTitle;

    @Column(name = "running_banner_cn", length = 300)
    private String runningBannerContent;

    @Column(name = "running_banner_url", length = 1000)
    private String runningBannerUrl;
}

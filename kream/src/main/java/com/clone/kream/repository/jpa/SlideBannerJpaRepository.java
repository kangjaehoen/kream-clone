package com.clone.kream.repository.jpa;

import com.clone.kream.entity.SlideBanner;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlideBannerJpaRepository extends JpaRepository<SlideBanner, Long> {
    List<SlideBanner> findAllByOrderByBannerIdAsc();
}

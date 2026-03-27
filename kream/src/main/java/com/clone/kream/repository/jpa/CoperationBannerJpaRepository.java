package com.clone.kream.repository.jpa;

import com.clone.kream.entity.CoperationBanner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoperationBannerJpaRepository extends JpaRepository<CoperationBanner, Long> {

    Optional<CoperationBanner> findTopByDeletedAtIsNullOrderByCoperationBannerIdDesc();
}

package com.clone.kream.repository.jpa;

import com.clone.kream.entity.RunningBanner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunningBannerJpaRepository extends JpaRepository<RunningBanner, Long> {

    Optional<RunningBanner> findTopByDeletedAtIsNullOrderByRunningBannerIdDesc();
}

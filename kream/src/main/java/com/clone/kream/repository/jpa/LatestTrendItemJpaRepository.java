package com.clone.kream.repository.jpa;

import com.clone.kream.entity.LatestTrendItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LatestTrendItemJpaRepository extends JpaRepository<LatestTrendItem, Long> {
    List<LatestTrendItem> findAllByDeletedAtIsNullOrderByLatestTrendItemIdAsc();
}

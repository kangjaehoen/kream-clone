package com.clone.kream.repository.jpa;

import com.clone.kream.entity.DailySeasonStyleItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailySeasonStyleItemJpaRepository extends JpaRepository<DailySeasonStyleItem, Long> {
    List<DailySeasonStyleItem> findAllByDeletedAtIsNullOrderByDailySeasonStyleItemIdAsc();
}

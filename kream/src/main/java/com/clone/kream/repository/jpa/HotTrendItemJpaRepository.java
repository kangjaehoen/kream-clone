package com.clone.kream.repository.jpa;

import com.clone.kream.entity.HotTrendItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotTrendItemJpaRepository extends JpaRepository<HotTrendItem, Long> {
    List<HotTrendItem> findAllByOrderByHotTrendItemIdAsc();
}

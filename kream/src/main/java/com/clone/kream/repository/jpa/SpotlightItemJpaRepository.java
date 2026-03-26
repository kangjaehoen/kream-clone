package com.clone.kream.repository.jpa;

import com.clone.kream.entity.SpotlightItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpotlightItemJpaRepository extends JpaRepository<SpotlightItem, Long> {
    List<SpotlightItem> findAllByOrderBySpotlightItemIdAsc();
}

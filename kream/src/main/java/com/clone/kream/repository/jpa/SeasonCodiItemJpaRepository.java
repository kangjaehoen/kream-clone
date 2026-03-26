package com.clone.kream.repository.jpa;

import com.clone.kream.entity.SeasonCodiItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonCodiItemJpaRepository extends JpaRepository<SeasonCodiItem, Long> {
    List<SeasonCodiItem> findAllByDeletedAtIsNullOrderBySeasonCodiItemIdAsc();
}

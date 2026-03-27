package com.clone.kream.repository.jpa;

import com.clone.kream.entity.PopularBrandItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopularBrandItemJpaRepository extends JpaRepository<PopularBrandItem, Long> {

    List<PopularBrandItem> findAllByPopularBrandKeywardIdAndDeletedAtIsNullOrderByPopularBrandItemIdAsc(
        Long popularBrandKeywardId
    );
}

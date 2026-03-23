package com.clone.kream.repository.jpa;

import com.clone.kream.entity.MostPopularItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MostPopularItemJpaRepository extends JpaRepository<MostPopularItem, Long> {
    List<MostPopularItem> findAllByOrderByMostPopularItemIdAsc();
}

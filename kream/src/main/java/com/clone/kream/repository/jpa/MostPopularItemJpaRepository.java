package com.clone.kream.repository.jpa;

import com.clone.kream.entity.MostPopularItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MostPopularItemJpaRepository extends JpaRepository<MostPopularItem, Long> {
}

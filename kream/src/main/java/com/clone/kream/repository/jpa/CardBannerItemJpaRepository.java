package com.clone.kream.repository.jpa;

import com.clone.kream.entity.CardBannerItem;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardBannerItemJpaRepository extends JpaRepository<CardBannerItem, Long> {
    Optional<CardBannerItem> findTopByOrderByCardBannerItemIdDesc();
}

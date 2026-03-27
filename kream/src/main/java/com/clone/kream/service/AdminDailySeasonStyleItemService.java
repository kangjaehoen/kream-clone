package com.clone.kream.service;

import com.clone.kream.entity.DailySeasonStyleItem;
import com.clone.kream.repository.jpa.DailySeasonStyleItemJpaRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminDailySeasonStyleItemService {

    private final DailySeasonStyleItemJpaRepository dailySeasonStyleItemJpaRepository;

    public AdminDailySeasonStyleItemService(DailySeasonStyleItemJpaRepository dailySeasonStyleItemJpaRepository) {
        this.dailySeasonStyleItemJpaRepository = dailySeasonStyleItemJpaRepository;
    }

    @Transactional(readOnly = true)
    public List<DailySeasonStyleItem> listActive() {
        return dailySeasonStyleItemJpaRepository.findAllByDeletedAtIsNullOrderByDailySeasonStyleItemIdAsc();
    }

    @Transactional
    public DailySeasonStyleItem create(
        String name,
        Long price,
        Long discountPercent,
        String image,
        String subImage,
        String url
    ) {
        LocalDateTime now = LocalDateTime.now();
        DailySeasonStyleItem entity = DailySeasonStyleItem.builder()
            .dailySeasonStyleItemName(name)
            .dailySeasonStyleItemPrice(price)
            .dailySeasonStyleItemDiscountPercent(discountPercent)
            .dailySeasonStyleItemImage(image)
            .dailySeasonStyleItemSubImage(subImage)
            .dailySeasonStyleItemUrl(url)
            .createdAt(now)
            .updatedAt(now)
            .deletedAt(null)
            .build();
        return dailySeasonStyleItemJpaRepository.save(entity);
    }

    @Transactional
    public DailySeasonStyleItem update(
        Long id,
        String name,
        Long price,
        Long discountPercent,
        String image,
        String subImage,
        String url
    ) {
        DailySeasonStyleItem entity = dailySeasonStyleItemJpaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("DailySeasonStyleItem not found: " + id));

        if (entity.getDeletedAt() != null) {
            throw new IllegalStateException("DailySeasonStyleItem already deleted: " + id);
        }

        entity.setDailySeasonStyleItemName(name);
        entity.setDailySeasonStyleItemPrice(price);
        entity.setDailySeasonStyleItemDiscountPercent(discountPercent);
        entity.setDailySeasonStyleItemImage(image);
        entity.setDailySeasonStyleItemSubImage(subImage);
        entity.setDailySeasonStyleItemUrl(url);
        entity.setUpdatedAt(LocalDateTime.now());
        return dailySeasonStyleItemJpaRepository.save(entity);
    }

    @Transactional
    public void softDelete(Long id) {
        DailySeasonStyleItem entity = dailySeasonStyleItemJpaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("DailySeasonStyleItem not found: " + id));

        if (entity.getDeletedAt() == null) {
            entity.setDeletedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
            dailySeasonStyleItemJpaRepository.save(entity);
        }
    }
}

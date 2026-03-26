package com.clone.kream.service;

import com.clone.kream.entity.WishKeyward;
import com.clone.kream.repository.jpa.WishKeywardJpaRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminWishKeywardService {

    private final WishKeywardJpaRepository wishKeywardJpaRepository;

    public AdminWishKeywardService(WishKeywardJpaRepository wishKeywardJpaRepository) {
        this.wishKeywardJpaRepository = wishKeywardJpaRepository;
    }

    @Transactional(readOnly = true)
    public List<WishKeyward> listActive() {
        return wishKeywardJpaRepository.findAllByDeletedAtIsNullOrderByWishKeywardIdAsc();
    }

    @Transactional
    public WishKeyward create(String name) {
        LocalDateTime now = LocalDateTime.now();
        WishKeyward entity = WishKeyward.builder()
            .wishKeywardName(name)
            .createdAt(now)
            .updatedAt(now)
            .deletedAt(null)
            .build();
        return wishKeywardJpaRepository.save(entity);
    }

    @Transactional
    public WishKeyward update(Long id, String name) {
        WishKeyward entity = wishKeywardJpaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("WishKeyward not found: " + id));

        if (entity.getDeletedAt() != null) {
            throw new IllegalStateException("WishKeyward already deleted: " + id);
        }

        entity.setWishKeywardName(name);
        entity.setUpdatedAt(LocalDateTime.now());
        return wishKeywardJpaRepository.save(entity);
    }

    @Transactional
    public void softDelete(Long id) {
        WishKeyward entity = wishKeywardJpaRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("WishKeyward not found: " + id));

        if (entity.getDeletedAt() == null) {
            entity.setDeletedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
            wishKeywardJpaRepository.save(entity);
        }
    }
}


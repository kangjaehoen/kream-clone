package com.clone.kream.repository.jpa;

import com.clone.kream.entity.WishItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishItemJpaRepository extends JpaRepository<WishItem, Long> {
    List<WishItem> findAllByOrderByWishItemIdAsc();
}

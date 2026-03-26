package com.clone.kream.repository.jpa;

import com.clone.kream.entity.WishKeyward;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishKeywardJpaRepository extends JpaRepository<WishKeyward, Long> {
    List<WishKeyward> findAllByOrderByWishKeywardIdAsc();

    List<WishKeyward> findAllByDeletedAtIsNullOrderByWishKeywardIdAsc();
}

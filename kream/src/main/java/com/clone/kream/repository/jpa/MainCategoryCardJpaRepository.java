package com.clone.kream.repository.jpa;

import com.clone.kream.entity.MainCategoryCard;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainCategoryCardJpaRepository extends JpaRepository<MainCategoryCard, Long> {
    List<MainCategoryCard> findAllByOrderByMainCardIdAsc();
}

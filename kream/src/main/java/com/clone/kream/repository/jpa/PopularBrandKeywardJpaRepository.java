package com.clone.kream.repository.jpa;

import com.clone.kream.entity.PopularBrandKeyward;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopularBrandKeywardJpaRepository extends JpaRepository<PopularBrandKeyward, Long> {

    List<PopularBrandKeyward> findAllByDeletedAtIsNullOrderByPopularBrandKeywardIdAsc();
}

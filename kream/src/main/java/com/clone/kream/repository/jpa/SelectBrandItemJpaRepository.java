package com.clone.kream.repository.jpa;

import com.clone.kream.entity.SelectBrandItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SelectBrandItemJpaRepository extends JpaRepository<SelectBrandItem, Long> {

    List<SelectBrandItem> findAllByDeletedAtIsNullOrderBySelectBrandItemIdAsc();
}

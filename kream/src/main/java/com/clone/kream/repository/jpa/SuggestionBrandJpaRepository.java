package com.clone.kream.repository.jpa;

import com.clone.kream.entity.SuggestionBrand;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionBrandJpaRepository extends JpaRepository<SuggestionBrand, Long> {

    List<SuggestionBrand> findAllByDeletedAtIsNullOrderBySuggestionBrandIdAsc();
}

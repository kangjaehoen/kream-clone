package com.clone.kream.repository.jpa;

import com.clone.kream.entity.MemberSuggestionItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSuggestionItemJpaRepository extends JpaRepository<MemberSuggestionItem, Long> {

    List<MemberSuggestionItem> findAllByDeletedAtIsNullOrderByMemberSuggestionItemIdAsc();
}

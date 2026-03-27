package com.clone.kream.dto;

public record MemberSuggestionItemDto(
    String memberSuggestionBrand,
    String memberSuggestionItemName,
    Long memberSuggestionItemPrice,
    Long memberSuggestionItemDiscountPercent,
    Long memberSuggestionItemInterest,
    Long memberSuggestionItemReview,
    Long memberSuggestionItemTrade,
    String memberSuggestionItemImage,
    String memberSuggestionItemUrl,
    String benefitBadgeClass,
    String benefitBadgeLabel,
    String benefitDescription,
    boolean showBenefitRow
) {}

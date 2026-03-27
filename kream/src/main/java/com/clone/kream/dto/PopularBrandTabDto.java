package com.clone.kream.dto;

import java.util.List;

public record PopularBrandTabDto(
    Long popularBrandKeywardId,
    String popularBrandKeywardName,
    List<PopularBrandItemDto> items
) {}

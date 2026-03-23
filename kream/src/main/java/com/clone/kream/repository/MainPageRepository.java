package com.clone.kream.repository;

import com.clone.kream.entity.CardBannerItem;
import com.clone.kream.entity.HotTrendItem;
import com.clone.kream.entity.MostPopularItem;
import com.clone.kream.entity.WishItem;
import com.clone.kream.entity.WishKeyward;
import com.clone.kream.repository.jpa.CardBannerItemJpaRepository;
import com.clone.kream.repository.jpa.HotTrendItemJpaRepository;
import com.clone.kream.repository.jpa.MostPopularItemJpaRepository;
import com.clone.kream.repository.jpa.WishItemJpaRepository;
import com.clone.kream.repository.jpa.WishKeywardJpaRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class MainPageRepository {

    private final WishKeywardJpaRepository wishKeywardJpaRepository;
    private final WishItemJpaRepository wishItemJpaRepository;
    private final HotTrendItemJpaRepository hotTrendItemJpaRepository;
    private final CardBannerItemJpaRepository cardBannerItemJpaRepository;
    private final MostPopularItemJpaRepository mostPopularItemJpaRepository;

    public MainPageRepository(
        WishKeywardJpaRepository wishKeywardJpaRepository,
        WishItemJpaRepository wishItemJpaRepository,
        HotTrendItemJpaRepository hotTrendItemJpaRepository,
        CardBannerItemJpaRepository cardBannerItemJpaRepository,
        MostPopularItemJpaRepository mostPopularItemJpaRepository
    ) {
        this.wishKeywardJpaRepository = wishKeywardJpaRepository;
        this.wishItemJpaRepository = wishItemJpaRepository;
        this.hotTrendItemJpaRepository = hotTrendItemJpaRepository;
        this.cardBannerItemJpaRepository = cardBannerItemJpaRepository;
        this.mostPopularItemJpaRepository = mostPopularItemJpaRepository;
    }

    public List<Map<String, Object>> findWishKeywords() {
        return wishKeywardJpaRepository.findAllByOrderByWishKeywardIdAsc()
            .stream()
            .map(this::toWishKeywordMap)
            .collect(Collectors.toList());
    }

    public List<Map<String, Object>> findWishItems() {
        return wishItemJpaRepository.findAllByOrderByWishItemIdAsc()
            .stream()
            .map(this::toWishItemMap)
            .collect(Collectors.toList());
    }

    public List<Map<String, Object>> findHotTrendItems() {
        return hotTrendItemJpaRepository.findAllByOrderByHotTrendItemIdAsc()
            .stream()
            .map(this::toHotTrendItemMap)
            .collect(Collectors.toList());
    }

    public Map<String, Object> findCardBannerItem() {
        return cardBannerItemJpaRepository.findTopByOrderByCardBannerItemIdDesc()
            .map(this::toCardBannerItemMap)
            .orElseGet(Map::of);
    }

    public List<Map<String, Object>> findMostPopularItems() {
        return mostPopularItemJpaRepository.findAllByOrderByMostPopularItemIdAsc()
            .stream()
            .map(this::toMostPopularItemMap)
            .collect(Collectors.toList());
    }

    private Map<String, Object> toWishKeywordMap(WishKeyward wishKeyward) {
        Map<String, Object> row = new HashMap<>();
        row.put("wish_keyward_nm", wishKeyward.getWishKeywardName());
        return row;
    }

    private Map<String, Object> toWishItemMap(WishItem wishItem) {
        Map<String, Object> row = new HashMap<>();
        row.put("wish_item_image", wishItem.getWishItemImage());
        row.put("wish_item_nm", wishItem.getWishItemName());
        row.put("wish_item_url", wishItem.getWishItemUrl());
        row.put("wish_item_price", wishItem.getWishItemPrice());
        row.put("wish_discount_percent", wishItem.getWishDiscountPercent());
        return row;
    }

    private Map<String, Object> toHotTrendItemMap(HotTrendItem hotTrendItem) {
        Map<String, Object> row = new HashMap<>();
        row.put("hot_trend_item_nm", hotTrendItem.getHotTrendItemName());
        row.put("hot_trend_item_image", hotTrendItem.getHotTrendItemImage());
        row.put("hot_trend_item_url", hotTrendItem.getHotTrendItemUrl());
        return row;
    }

    private Map<String, Object> toCardBannerItemMap(CardBannerItem cardBannerItem) {
        Map<String, Object> row = new HashMap<>();
        row.put("card_banner_item_nm", cardBannerItem.getCardBannerItemName());
        row.put("card_banner_item_sub_nm", cardBannerItem.getCardBannerItemSubName());
        row.put("card_banner_item_dec", cardBannerItem.getCardBannerItemDescription());
        row.put("card_banner_item_image", cardBannerItem.getCardBannerItemImage());
        row.put("card_banner_url", cardBannerItem.getCardBannerUrl());
        return row;
    }

    private Map<String, Object> toMostPopularItemMap(MostPopularItem mostPopularItem) {
        Map<String, Object> row = new HashMap<>();
        row.put("most_popular_item_nm", mostPopularItem.getMostPopularItemName());
        row.put("most_popular_item_price", mostPopularItem.getMostPopularItemPrice());
        row.put("most_popular_item_discount_percent", mostPopularItem.getMostPopularItemDiscountPercent());
        row.put("most_popular_item_interest", mostPopularItem.getMostPopularItemInterest());
        row.put("most_popular_item_review", mostPopularItem.getMostPopularItemReview());
        row.put("most_popular_item_image", mostPopularItem.getMostPopularItemImage());
        row.put("most_popular_item_url", mostPopularItem.getMostPopularItemUrl());
        return row;
    }
}

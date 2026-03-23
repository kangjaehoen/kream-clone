package com.clone.kream.repository;

import com.clone.kream.dto.CardBannerItemDto;
import com.clone.kream.dto.HotTrendItemDto;
import com.clone.kream.dto.MostPopularItemDto;
import com.clone.kream.dto.WishItemDto;
import com.clone.kream.dto.WishKeywordDto;
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
import java.util.List;
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

    public List<WishKeywordDto> findWishKeywords() {
        return wishKeywardJpaRepository.findAllByOrderByWishKeywardIdAsc()
            .stream()
            .map(this::toWishKeywordDto)
            .collect(Collectors.toList());
    }

    public List<WishItemDto> findWishItems() {
        return wishItemJpaRepository.findAllByOrderByWishItemIdAsc()
            .stream()
            .map(this::toWishItemDto)
            .collect(Collectors.toList());
    }

    public List<HotTrendItemDto> findHotTrendItems() {
        return hotTrendItemJpaRepository.findAllByOrderByHotTrendItemIdAsc()
            .stream()
            .map(this::toHotTrendItemDto)
            .collect(Collectors.toList());
    }

    public CardBannerItemDto findCardBannerItem() {
        return cardBannerItemJpaRepository.findTopByOrderByCardBannerItemIdDesc()
            .map(this::toCardBannerItemDto)
            .orElse(null);
    }

    public List<MostPopularItemDto> findMostPopularItems() {
        return mostPopularItemJpaRepository.findAllByOrderByMostPopularItemIdAsc()
            .stream()
            .map(this::toMostPopularItemDto)
            .collect(Collectors.toList());
    }

    private WishKeywordDto toWishKeywordDto(WishKeyward wishKeyward) {
        return new WishKeywordDto(wishKeyward.getWishKeywardName());
    }

    private WishItemDto toWishItemDto(WishItem wishItem) {
        return new WishItemDto(
            wishItem.getWishItemImage(),
            wishItem.getWishItemName(),
            wishItem.getWishItemUrl(),
            wishItem.getWishItemPrice(),
            wishItem.getWishDiscountPercent()
        );
    }

    private HotTrendItemDto toHotTrendItemDto(HotTrendItem hotTrendItem) {
        return new HotTrendItemDto(
            hotTrendItem.getHotTrendItemName(),
            hotTrendItem.getHotTrendItemImage(),
            hotTrendItem.getHotTrendItemUrl()
        );
    }

    private CardBannerItemDto toCardBannerItemDto(CardBannerItem cardBannerItem) {
        return new CardBannerItemDto(
            cardBannerItem.getCardBannerItemName(),
            cardBannerItem.getCardBannerItemSubName(),
            cardBannerItem.getCardBannerItemDescription(),
            cardBannerItem.getCardBannerItemImage(),
            cardBannerItem.getCardBannerUrl()
        );
    }

    private MostPopularItemDto toMostPopularItemDto(MostPopularItem mostPopularItem) {
        return new MostPopularItemDto(
            mostPopularItem.getMostPopularItemName(),
            mostPopularItem.getMostPopularItemPrice(),
            mostPopularItem.getMostPopularItemDiscountPercent(),
            mostPopularItem.getMostPopularItemInterest(),
            mostPopularItem.getMostPopularItemReview(),
            mostPopularItem.getMostPopularItemImage(),
            mostPopularItem.getMostPopularItemUrl()
        );
    }
}

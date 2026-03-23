package com.clone.kream.mapper;

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
import org.springframework.stereotype.Component;

@Component
public class MainPageMapper {

    public WishKeywordDto toWishKeywordDto(WishKeyward wishKeyward) {
        return new WishKeywordDto(wishKeyward.getWishKeywardName());
    }

    public WishItemDto toWishItemDto(WishItem wishItem) {
        return new WishItemDto(
            wishItem.getWishItemImage(),
            wishItem.getWishItemName(),
            wishItem.getWishItemUrl(),
            wishItem.getWishItemPrice(),
            wishItem.getWishDiscountPercent()
        );
    }

    public HotTrendItemDto toHotTrendItemDto(HotTrendItem hotTrendItem) {
        return new HotTrendItemDto(
            hotTrendItem.getHotTrendItemName(),
            hotTrendItem.getHotTrendItemImage(),
            hotTrendItem.getHotTrendItemUrl()
        );
    }

    public CardBannerItemDto toCardBannerItemDto(CardBannerItem cardBannerItem) {
        if (cardBannerItem == null) {
            return null;
        }

        return new CardBannerItemDto(
            cardBannerItem.getCardBannerItemName(),
            cardBannerItem.getCardBannerItemSubName(),
            cardBannerItem.getCardBannerItemDescription(),
            cardBannerItem.getCardBannerItemImage(),
            cardBannerItem.getCardBannerUrl()
        );
    }

    public MostPopularItemDto toMostPopularItemDto(MostPopularItem mostPopularItem) {
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

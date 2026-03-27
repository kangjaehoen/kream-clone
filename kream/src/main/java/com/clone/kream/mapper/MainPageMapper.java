package com.clone.kream.mapper;

import com.clone.kream.dto.CardBannerItemDto;
import com.clone.kream.dto.CoperationBannerDto;
import com.clone.kream.dto.DailySeasonStyleItemDto;
import com.clone.kream.dto.SeasonCodiItemDto;
import com.clone.kream.dto.HotTrendItemDto;
import com.clone.kream.dto.LatestTrendItemDto;
import com.clone.kream.dto.MainCategoryCardDto;
import com.clone.kream.dto.MenuDto;
import com.clone.kream.dto.MostPopularItemDto;
import com.clone.kream.dto.PopularBrandItemDto;
import com.clone.kream.dto.SlideBannerDto;
import com.clone.kream.dto.SuggestionBrandDto;
import com.clone.kream.dto.SpotlightItemDto;
import com.clone.kream.dto.WishItemDto;
import com.clone.kream.dto.WishKeywordDto;
import com.clone.kream.entity.CardBannerItem;
import com.clone.kream.entity.CoperationBanner;
import com.clone.kream.entity.DailySeasonStyleItem;
import com.clone.kream.entity.HotTrendItem;
import com.clone.kream.entity.LatestTrendItem;
import com.clone.kream.entity.MainCategoryCard;
import com.clone.kream.entity.Menu;
import com.clone.kream.entity.MostPopularItem;
import com.clone.kream.entity.PopularBrandItem;
import com.clone.kream.entity.SeasonCodiItem;
import com.clone.kream.entity.SlideBanner;
import com.clone.kream.entity.SpotlightItem;
import com.clone.kream.entity.SuggestionBrand;
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

    public LatestTrendItemDto toLatestTrendItemDto(LatestTrendItem latestTrendItem) {
        return new LatestTrendItemDto(
            latestTrendItem.getLatestTrendItemName(),
            latestTrendItem.getLatestTrendItemSubName(),
            latestTrendItem.getLatestTrendItemBrand(),
            latestTrendItem.getLatestTrendItemImage(),
            latestTrendItem.getLatestTrendItemUrl()
        );
    }

    public CoperationBannerDto toCoperationBannerDto(CoperationBanner coperationBanner) {
        if (coperationBanner == null) {
            return null;
        }
        return new CoperationBannerDto(
            coperationBanner.getCoperationBannerFirstImage(),
            coperationBanner.getCoperationBannerSecondImage(),
            coperationBanner.getCoperationBannerTitle(),
            coperationBanner.getCoperationBannerContent(),
            coperationBanner.getCoperationBannerUrl()
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

    public MenuDto toMenuDto(Menu menu) {
        return new MenuDto(
            menu.getMenuName(),
            menu.getMenuUrl()
        );
    }

    public SlideBannerDto toSlideBannerDto(SlideBanner slideBanner) {
        return new SlideBannerDto(
            slideBanner.getBannerImage(),
            slideBanner.getBannerTitle(),
            slideBanner.getBannerContent(),
            slideBanner.getBannerUrl()
        );
    }

    public MainCategoryCardDto toMainCategoryCardDto(MainCategoryCard mainCategoryCard) {
        return new MainCategoryCardDto(
            mainCategoryCard.getMainCardImage(),
            mainCategoryCard.getMainCardName(),
            mainCategoryCard.getMainCardUrl()
        );
    }

    public SpotlightItemDto toSpotlightItemDto(SpotlightItem spotlightItem) {
        return new SpotlightItemDto(
            spotlightItem.getSpotlightItemImage(),
            spotlightItem.getSpotlightItemName(),
            spotlightItem.getSpotlightItemUrl()
        );
    }

    public DailySeasonStyleItemDto toDailySeasonStyleItemDto(DailySeasonStyleItem dailySeasonStyleItem) {
        return new DailySeasonStyleItemDto(
            dailySeasonStyleItem.getDailySeasonStyleItemName(),
            dailySeasonStyleItem.getDailySeasonStyleItemPrice(),
            dailySeasonStyleItem.getDailySeasonStyleItemDiscountPercent(),
            dailySeasonStyleItem.getDailySeasonStyleItemImage(),
            dailySeasonStyleItem.getDailySeasonStyleItemSubImage(),
            dailySeasonStyleItem.getDailySeasonStyleItemUrl()
        );
    }

    public SeasonCodiItemDto toSeasonCodiItemDto(SeasonCodiItem seasonCodiItem) {
        return new SeasonCodiItemDto(
            seasonCodiItem.getSeasonCodiItemImage(),
            seasonCodiItem.getSeasonCodiItemUrl()
        );
    }

    public PopularBrandItemDto toPopularBrandItemDto(PopularBrandItem popularBrandItem) {
        return new PopularBrandItemDto(
            popularBrandItem.getPopularBrandItemName(),
            popularBrandItem.getPopularBrandItemPrice(),
            popularBrandItem.getPopularBrandItemDiscountPercent(),
            popularBrandItem.getPopularBrandItemInterest(),
            popularBrandItem.getPopularBrandItemReview(),
            popularBrandItem.getPopularBrandItemImage(),
            popularBrandItem.getPopularBrandItemUrl()
        );
    }

    public SuggestionBrandDto toSuggestionBrandDto(SuggestionBrand suggestionBrand) {
        return new SuggestionBrandDto(
            suggestionBrand.getSuggestionBrandName(),
            suggestionBrand.getSuggestionBrandImage(),
            suggestionBrand.getSuggestionBrandUrl()
        );
    }
}

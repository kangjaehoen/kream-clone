package com.clone.kream.repository;

import com.clone.kream.entity.CardBannerItem;
import com.clone.kream.entity.CoperationBanner;
import com.clone.kream.entity.DailySeasonStyleItem;
import com.clone.kream.entity.HotTrendItem;
import com.clone.kream.entity.LatestTrendItem;
import com.clone.kream.entity.MainCategoryCard;
import com.clone.kream.entity.MemberSuggestionItem;
import com.clone.kream.entity.MostPopularItem;
import com.clone.kream.entity.Menu;
import com.clone.kream.entity.PopularBrandItem;
import com.clone.kream.entity.PopularBrandKeyward;
import com.clone.kream.entity.RunningBanner;
import com.clone.kream.entity.SeasonCodiItem;
import com.clone.kream.entity.SlideBanner;
import com.clone.kream.entity.SpotlightItem;
import com.clone.kream.entity.SuggestionBrand;
import com.clone.kream.entity.WishItem;
import com.clone.kream.entity.WishKeyward;
import com.clone.kream.repository.jpa.CardBannerItemJpaRepository;
import com.clone.kream.repository.jpa.CoperationBannerJpaRepository;
import com.clone.kream.repository.jpa.DailySeasonStyleItemJpaRepository;
import com.clone.kream.repository.jpa.HotTrendItemJpaRepository;
import com.clone.kream.repository.jpa.LatestTrendItemJpaRepository;
import com.clone.kream.repository.jpa.MemberSuggestionItemJpaRepository;
import com.clone.kream.repository.jpa.MainCategoryCardJpaRepository;
import com.clone.kream.repository.jpa.MenuJpaRepository;
import com.clone.kream.repository.jpa.MostPopularItemJpaRepository;
import com.clone.kream.repository.jpa.PopularBrandItemJpaRepository;
import com.clone.kream.repository.jpa.PopularBrandKeywardJpaRepository;
import com.clone.kream.repository.jpa.RunningBannerJpaRepository;
import com.clone.kream.repository.jpa.SeasonCodiItemJpaRepository;
import com.clone.kream.repository.jpa.SlideBannerJpaRepository;
import com.clone.kream.repository.jpa.SpotlightItemJpaRepository;
import com.clone.kream.repository.jpa.SuggestionBrandJpaRepository;
import com.clone.kream.repository.jpa.WishItemJpaRepository;
import com.clone.kream.repository.jpa.WishKeywardJpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MainPageRepository {

    private final WishKeywardJpaRepository wishKeywardJpaRepository;
    private final WishItemJpaRepository wishItemJpaRepository;
    private final HotTrendItemJpaRepository hotTrendItemJpaRepository;
    private final LatestTrendItemJpaRepository latestTrendItemJpaRepository;
    private final MainCategoryCardJpaRepository mainCategoryCardJpaRepository;
    private final SlideBannerJpaRepository slideBannerJpaRepository;
    private final MenuJpaRepository menuJpaRepository;
    private final CardBannerItemJpaRepository cardBannerItemJpaRepository;
    private final MostPopularItemJpaRepository mostPopularItemJpaRepository;
    private final SpotlightItemJpaRepository spotlightItemJpaRepository;
    private final DailySeasonStyleItemJpaRepository dailySeasonStyleItemJpaRepository;
    private final SeasonCodiItemJpaRepository seasonCodiItemJpaRepository;
    private final PopularBrandKeywardJpaRepository popularBrandKeywardJpaRepository;
    private final PopularBrandItemJpaRepository popularBrandItemJpaRepository;
    private final CoperationBannerJpaRepository coperationBannerJpaRepository;
    private final RunningBannerJpaRepository runningBannerJpaRepository;
    private final SuggestionBrandJpaRepository suggestionBrandJpaRepository;
    private final MemberSuggestionItemJpaRepository memberSuggestionItemJpaRepository;

    public MainPageRepository(
        WishKeywardJpaRepository wishKeywardJpaRepository,
        WishItemJpaRepository wishItemJpaRepository,
        HotTrendItemJpaRepository hotTrendItemJpaRepository,
        LatestTrendItemJpaRepository latestTrendItemJpaRepository,
        MainCategoryCardJpaRepository mainCategoryCardJpaRepository,
        SlideBannerJpaRepository slideBannerJpaRepository,
        MenuJpaRepository menuJpaRepository,
        CardBannerItemJpaRepository cardBannerItemJpaRepository,
        MostPopularItemJpaRepository mostPopularItemJpaRepository,
        SpotlightItemJpaRepository spotlightItemJpaRepository,
        DailySeasonStyleItemJpaRepository dailySeasonStyleItemJpaRepository,
        SeasonCodiItemJpaRepository seasonCodiItemJpaRepository,
        PopularBrandKeywardJpaRepository popularBrandKeywardJpaRepository,
        PopularBrandItemJpaRepository popularBrandItemJpaRepository,
        CoperationBannerJpaRepository coperationBannerJpaRepository,
        RunningBannerJpaRepository runningBannerJpaRepository,
        SuggestionBrandJpaRepository suggestionBrandJpaRepository,
        MemberSuggestionItemJpaRepository memberSuggestionItemJpaRepository
    ) {
        this.wishKeywardJpaRepository = wishKeywardJpaRepository;
        this.wishItemJpaRepository = wishItemJpaRepository;
        this.hotTrendItemJpaRepository = hotTrendItemJpaRepository;
        this.latestTrendItemJpaRepository = latestTrendItemJpaRepository;
        this.mainCategoryCardJpaRepository = mainCategoryCardJpaRepository;
        this.slideBannerJpaRepository = slideBannerJpaRepository;
        this.menuJpaRepository = menuJpaRepository;
        this.cardBannerItemJpaRepository = cardBannerItemJpaRepository;
        this.mostPopularItemJpaRepository = mostPopularItemJpaRepository;
        this.spotlightItemJpaRepository = spotlightItemJpaRepository;
        this.dailySeasonStyleItemJpaRepository = dailySeasonStyleItemJpaRepository;
        this.seasonCodiItemJpaRepository = seasonCodiItemJpaRepository;
        this.popularBrandKeywardJpaRepository = popularBrandKeywardJpaRepository;
        this.popularBrandItemJpaRepository = popularBrandItemJpaRepository;
        this.coperationBannerJpaRepository = coperationBannerJpaRepository;
        this.runningBannerJpaRepository = runningBannerJpaRepository;
        this.suggestionBrandJpaRepository = suggestionBrandJpaRepository;
        this.memberSuggestionItemJpaRepository = memberSuggestionItemJpaRepository;
    }

    public List<WishKeyward> findWishKeywords() {
        return wishKeywardJpaRepository.findAllByDeletedAtIsNullOrderByWishKeywardIdAsc();
    }

    public List<WishItem> findWishItems() {
        return wishItemJpaRepository.findAllByOrderByWishItemIdAsc();
    }

    public List<HotTrendItem> findHotTrendItems() {
        return hotTrendItemJpaRepository.findAllByOrderByHotTrendItemIdAsc();
    }

    public List<LatestTrendItem> findLatestTrendItems() {
        return latestTrendItemJpaRepository.findAllByDeletedAtIsNullOrderByLatestTrendItemIdAsc();
    }

    public List<MainCategoryCard> findMainCategoryCards() {
        return mainCategoryCardJpaRepository.findAllByOrderByMainCardIdAsc();
    }

    public List<Menu> findMenus() {
        return menuJpaRepository.findAllByOrderByMenuIdAsc();
    }

    public List<SlideBanner> findSlideBanners() {
        return slideBannerJpaRepository.findAllByOrderByBannerIdAsc();
    }

    public CardBannerItem findCardBannerItem() {
        return cardBannerItemJpaRepository.findTopByDeletedAtIsNullOrderByCardBannerItemIdDesc().orElse(null);
    }

    public List<MostPopularItem> findMostPopularItems() {
        return mostPopularItemJpaRepository.findAllByOrderByMostPopularItemIdAsc();
    }

    public List<SpotlightItem> findSpotlightItems() {
        return spotlightItemJpaRepository.findAllByOrderBySpotlightItemIdAsc();
    }

    public List<DailySeasonStyleItem> findDailySeasonStyleItems() {
        return dailySeasonStyleItemJpaRepository.findAllByDeletedAtIsNullOrderByDailySeasonStyleItemIdAsc();
    }

    public List<SeasonCodiItem> findSeasonCodiItems() {
        return seasonCodiItemJpaRepository.findAllByDeletedAtIsNullOrderBySeasonCodiItemIdAsc();
    }

    public List<PopularBrandKeyward> findPopularBrandKeywords() {
        return popularBrandKeywardJpaRepository.findAllByDeletedAtIsNullOrderByPopularBrandKeywardIdAsc();
    }

    public List<PopularBrandItem> findPopularBrandItemsByKeywardId(Long popularBrandKeywardId) {
        return popularBrandItemJpaRepository.findAllByPopularBrandKeywardIdAndDeletedAtIsNullOrderByPopularBrandItemIdAsc(
            popularBrandKeywardId
        );
    }

    public CoperationBanner findCoperationBanner() {
        return coperationBannerJpaRepository.findTopByDeletedAtIsNullOrderByCoperationBannerIdDesc().orElse(null);
    }

    public RunningBanner findRunningBanner() {
        return runningBannerJpaRepository.findTopByDeletedAtIsNullOrderByRunningBannerIdDesc().orElse(null);
    }

    public List<SuggestionBrand> findSuggestionBrands() {
        return suggestionBrandJpaRepository.findAllByDeletedAtIsNullOrderBySuggestionBrandIdAsc();
    }

    public List<MemberSuggestionItem> findMemberSuggestionItems() {
        return memberSuggestionItemJpaRepository.findAllByDeletedAtIsNullOrderByMemberSuggestionItemIdAsc();
    }
}

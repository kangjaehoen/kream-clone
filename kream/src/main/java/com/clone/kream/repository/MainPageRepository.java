package com.clone.kream.repository;

import com.clone.kream.entity.CardBannerItem;
import com.clone.kream.entity.HotTrendItem;
import com.clone.kream.entity.MainCategoryCard;
import com.clone.kream.entity.MostPopularItem;
import com.clone.kream.entity.Menu;
import com.clone.kream.entity.SlideBanner;
import com.clone.kream.entity.SpotlightItem;
import com.clone.kream.entity.WishItem;
import com.clone.kream.entity.WishKeyward;
import com.clone.kream.repository.jpa.CardBannerItemJpaRepository;
import com.clone.kream.repository.jpa.HotTrendItemJpaRepository;
import com.clone.kream.repository.jpa.MainCategoryCardJpaRepository;
import com.clone.kream.repository.jpa.MenuJpaRepository;
import com.clone.kream.repository.jpa.MostPopularItemJpaRepository;
import com.clone.kream.repository.jpa.SlideBannerJpaRepository;
import com.clone.kream.repository.jpa.SpotlightItemJpaRepository;
import com.clone.kream.repository.jpa.WishItemJpaRepository;
import com.clone.kream.repository.jpa.WishKeywardJpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MainPageRepository {

    private final WishKeywardJpaRepository wishKeywardJpaRepository;
    private final WishItemJpaRepository wishItemJpaRepository;
    private final HotTrendItemJpaRepository hotTrendItemJpaRepository;
    private final MainCategoryCardJpaRepository mainCategoryCardJpaRepository;
    private final SlideBannerJpaRepository slideBannerJpaRepository;
    private final MenuJpaRepository menuJpaRepository;
    private final CardBannerItemJpaRepository cardBannerItemJpaRepository;
    private final MostPopularItemJpaRepository mostPopularItemJpaRepository;
    private final SpotlightItemJpaRepository spotlightItemJpaRepository;

    public MainPageRepository(
        WishKeywardJpaRepository wishKeywardJpaRepository,
        WishItemJpaRepository wishItemJpaRepository,
        HotTrendItemJpaRepository hotTrendItemJpaRepository,
        MainCategoryCardJpaRepository mainCategoryCardJpaRepository,
        SlideBannerJpaRepository slideBannerJpaRepository,
        MenuJpaRepository menuJpaRepository,
        CardBannerItemJpaRepository cardBannerItemJpaRepository,
        MostPopularItemJpaRepository mostPopularItemJpaRepository,
        SpotlightItemJpaRepository spotlightItemJpaRepository
    ) {
        this.wishKeywardJpaRepository = wishKeywardJpaRepository;
        this.wishItemJpaRepository = wishItemJpaRepository;
        this.hotTrendItemJpaRepository = hotTrendItemJpaRepository;
        this.mainCategoryCardJpaRepository = mainCategoryCardJpaRepository;
        this.slideBannerJpaRepository = slideBannerJpaRepository;
        this.menuJpaRepository = menuJpaRepository;
        this.cardBannerItemJpaRepository = cardBannerItemJpaRepository;
        this.mostPopularItemJpaRepository = mostPopularItemJpaRepository;
        this.spotlightItemJpaRepository = spotlightItemJpaRepository;
    }

    public List<WishKeyward> findWishKeywords() {
        return wishKeywardJpaRepository.findAllByOrderByWishKeywardIdAsc();
    }

    public List<WishItem> findWishItems() {
        return wishItemJpaRepository.findAllByOrderByWishItemIdAsc();
    }

    public List<HotTrendItem> findHotTrendItems() {
        return hotTrendItemJpaRepository.findAllByOrderByHotTrendItemIdAsc();
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
        return cardBannerItemJpaRepository.findTopByOrderByCardBannerItemIdDesc().orElse(null);
    }

    public List<MostPopularItem> findMostPopularItems() {
        return mostPopularItemJpaRepository.findAllByOrderByMostPopularItemIdAsc();
    }

    public List<SpotlightItem> findSpotlightItems() {
        return spotlightItemJpaRepository.findAllByOrderBySpotlightItemIdAsc();
    }
}

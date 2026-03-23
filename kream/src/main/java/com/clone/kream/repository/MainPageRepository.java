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
import java.util.List;
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

    public List<WishKeyward> findWishKeywords() {
        return wishKeywardJpaRepository.findAllByOrderByWishKeywardIdAsc();
    }

    public List<WishItem> findWishItems() {
        return wishItemJpaRepository.findAllByOrderByWishItemIdAsc();
    }

    public List<HotTrendItem> findHotTrendItems() {
        return hotTrendItemJpaRepository.findAllByOrderByHotTrendItemIdAsc();
    }

    public CardBannerItem findCardBannerItem() {
        return cardBannerItemJpaRepository.findTopByOrderByCardBannerItemIdDesc().orElse(null);
    }

    public List<MostPopularItem> findMostPopularItems() {
        return mostPopularItemJpaRepository.findAllByOrderByMostPopularItemIdAsc();
    }
}

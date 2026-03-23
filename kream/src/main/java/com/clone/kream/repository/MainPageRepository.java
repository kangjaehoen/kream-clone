package com.clone.kream.repository;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MainPageRepository {

    private final JdbcTemplate jdbcTemplate;

    public MainPageRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> findWishKeywords() {
        return jdbcTemplate.queryForList("""
            SELECT wish_keyward_nm
            FROM wish_keyward
            ORDER BY id ASC
            """);
    }

    public List<Map<String, Object>> findWishItems() {
        return jdbcTemplate.queryForList("""
            SELECT
                wish_item_image,
                wish_item_nm,
                wish_item_url,
                wish_item_price,
                wish_discount_percent
            FROM wish_items
            ORDER BY id ASC
            """);
    }

    public List<Map<String, Object>> findHotTrendItems() {
        return jdbcTemplate.queryForList("""
            SELECT
                hot_trand_item_nm AS hot_trend_item_nm,
                hot_trand_item_image AS hot_trend_item_image,
                hot_trand_item_url AS hot_trend_item_url
            FROM hot_trend_item
            ORDER BY id ASC
            """);
    }

    public Map<String, Object> findCardBannerItem() {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("""
            SELECT
                card_banner_item_nm,
                card_banner_item_sub_nm,
                card_banner_item_dec,
                card_banner_item_image,
                card_banner_url
            FROM card_banner_item
            ORDER BY id DESC
            LIMIT 1
            """);

        return rows.isEmpty() ? Map.of() : rows.get(0);
    }

    public List<Map<String, Object>> findMostPopularItems() {
        return jdbcTemplate.queryForList("""
            SELECT
                most_popular_item_nm,
                most_popular_item_price,
                most_popular_item_discount_percent,
                most_popular_item_interest,
                most_popular_item_review,
                most_popular_item_image,
                most_popular_item_url
            FROM most_popular_item
            ORDER BY id ASC
            """);
    }
}

package com.clone.kream.repository.jpa;

import com.clone.kream.entity.Menu;



import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest

class MenuJpaRepositoryTest {

    @Autowired
    private MenuJpaRepository menuJpaRepository;

    @Test
    void findAll_executesAndReturnsMenus() {
        List<Menu> menus = menuJpaRepository.findAll();

        System.out.println("menus 데이터: " + menus);

        assertThat(menus).isNotNull();
        if (!menus.isEmpty()) {
            System.out.println("menus count = " + menus.size());
            System.out.println("first menu = " + menus.get(0).getMenuName() + " / " + menus.get(0).getMenuUrl());
        } else {
            System.out.println("menus count = 0");
        }
    }
}

package com.clone.kream.repository.jpa;

import com.clone.kream.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuJpaRepository extends JpaRepository<Menu, Long> {

    List<Menu> findAllByOrderByMenuIdAsc();
}

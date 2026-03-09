package com.clone.kream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * 임시지거으로 datasource, jpa, redis 자동 설정 비활성화
 */
@SpringBootApplication(exclude = {
	DataSourceAutoConfiguration.class,
	HibernateJpaAutoConfiguration.class,
	JpaRepositoriesAutoConfiguration.class,
	RedisAutoConfiguration.class
})
public class KreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(KreamApplication.class, args);
	}

}

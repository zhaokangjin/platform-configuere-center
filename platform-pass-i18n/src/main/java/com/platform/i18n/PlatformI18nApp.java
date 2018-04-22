package com.platform.i18n;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@ComponentScan(basePackages={"com.platform.i18n"})
@MapperScan("com.platform.i18n.persistence")
public class PlatformI18nApp {
	public static void main(String[] args) {
		SpringApplication.run(PlatformI18nApp.class, args);
	}
}

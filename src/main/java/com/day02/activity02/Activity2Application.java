package com.day02.activity02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@EnableCaching 
public class Activity2Application {

	public static void main(String[] args) {
		SpringApplication.run(Activity2Application.class, args);
	}
	@Bean
	public CacheManager cacheManager() {
    	net.sf.ehcache.CacheManager ch= ehCacheCacheManager().getObject();	
		return new EhCacheCacheManager(ch);
	}

	@Bean
	public EhCacheManagerFactoryBean ehCacheCacheManager() {
		EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
		cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
		cmfb.setShared(true);
		return cmfb;
	}
}

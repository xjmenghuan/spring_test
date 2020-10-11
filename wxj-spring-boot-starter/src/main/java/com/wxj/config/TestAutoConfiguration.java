package com.wxj.config;

import com.wxj.entity.TestEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAutoConfiguration {

    @Bean
    public TestEntity createEntity(){
        return new TestEntity();
    }
}

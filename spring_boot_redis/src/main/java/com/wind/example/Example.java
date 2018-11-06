package com.wind.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.net.URL;

public class Example {


    //spring boot 1.4 以后得版本，配置了 pom、配置了 application.properties之后，就可以直接引用了
    //需要注意得一个问题是，序列号问题。
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void addLink(String userId, URL url) {
        redisTemplate.opsForList().leftPush(userId, url.toExternalForm());
    }
}

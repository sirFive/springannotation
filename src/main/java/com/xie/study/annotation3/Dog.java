package com.xie.study.annotation3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 初始化和销毁方法3：
 * 使用@PostConstruct
 */
@Component
public class Dog {
    public Dog(){

    }

    /**
     * 对象创建并且赋值后调用
     */
    @PostConstruct
    public void init3(){
        System.out.println("dog初始化");
    }

    /**
     * 销毁前调用该方法
     */
    @PreDestroy
    public void destory3(){
        System.out.println("dog destory销毁");
    }
}

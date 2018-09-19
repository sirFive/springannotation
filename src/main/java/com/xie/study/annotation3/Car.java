package com.xie.study.annotation3;

/**
 * 初始化方法一：
 * 注解声命：initMethod和destoryMethod
 */
public class Car {

    public Car(){
        System.out.println("car constract");
    }

    public void initCar(){
        System.out.println("car init's method");
    }

    public void destoryCar(){
        System.out.println("car destory's method");
    }
}

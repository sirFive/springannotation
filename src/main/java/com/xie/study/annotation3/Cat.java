package com.xie.study.annotation3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 初始化和销毁方法2：
 * InitializingBean,DisposableBean
 */
@Component
public class Cat implements InitializingBean,DisposableBean {

    public Cat(){

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat 属性设置好后（也算一种初始化方法）");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat bean的销毁方法");
    }
}

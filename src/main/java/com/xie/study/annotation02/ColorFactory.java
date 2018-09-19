package com.xie.study.annotation02;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class ColorFactory implements FactoryBean<Color> {
    /**
     * 返回一个对象（Color），这个对象会被添加到容器中
     * @return
     * @throws Exception
     */
    @Nullable
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    /**
     * 返回bean的类型
     * @return
     */
    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 设置该bean是否为单例,true为单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}

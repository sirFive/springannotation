package com.xie.study.annotation04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * 属性赋值@Value
 * 1.基本数值       @Value("谢")
 * 2.spel 表达式   @Value("#{20+5}")  结果为：25
 * 3.取出配置文件中的值（在运行环境变量里面的值） @Value("${spring.xie.address}")
 *
 * 4.引入外部配置文件（在配置类中添加）：
 *  @PropertySource(value = "classpath:/person.properties，classpath:/dog.properties")
 * @Pr
 */
public class AnnotationProperty {

    @Value("谢")
    private String name;

    @Value("#{20+5}")
    private int age;

    @Value("${spring.xie.address}")
    private String address;

}

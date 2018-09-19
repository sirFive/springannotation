package com.xie.study.annotation02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FactoryBean为工厂bean，他返回的是方法getObject() 中的bean
 * 可以通过isSingleton() 来决定返回的是单例还是多态
 * 如果要获取工厂bean本身则需要在id前面加一个&标识：applicationContext.getBean("&colorFactory2");
 */
@Configuration
public class FactoryBeanAnnotation {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanAnnotation.class);
        String beanNames[] = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println("beanName:"+beanName);
        }

        //加&标识 可以获取工厂bean本身
        //Object object = applicationContext.getBean("&colorFactory2");

        Object object = applicationContext.getBean("colorFactory2");

        //输出的结果为：object的类型：class com.xie.study.annotation02.Color
        System.out.printf("object的类型："+object.getClass());
    }

    @Bean
    public ColorFactory colorFactory2(){
        return new ColorFactory();
    }
}

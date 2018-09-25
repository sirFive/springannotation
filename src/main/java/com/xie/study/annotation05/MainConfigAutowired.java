package com.xie.study.annotation05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 自动装配：spring利用依赖注入（DI），完成对IOC容器中各个组件依赖关系的赋值
 *
 * 1.autowired ：自动注入
 *  1.默认优先按照类型获取容器中的组件赋值(名字默认类型小写)，如果该类型组件有多个，再将属性的名称作为组件的Id去容器中查找
 *
 * 2.@Qualitfier("xieDao2") ,指定要装备的组件Id,而不是使用默认的属性名
 * 3.自动装备一定要将属性赋值好，否则会报错。但是可以用@Autowired(required = false) 避免（即找不到就为null）
 * 4.@Primary，让spring进行自动装备的时候，默认使用首选的bean:
 *              @Primary
 *               @Bean("xieDao2")
 *          比如：XieDao xieDao;
 *          则spring在装备xieDao的时候优先装载xieDao2
 */
@Configuration
@Component("com.xie.study.annotation05")
public class MainConfigAutowired {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAutowired.class);

        //根据service自动装配进去的xieDao
        XieService xieService = (XieService) applicationContext.getBean(XieService.class);
        //获取容器中的xieDao
        XieDao xieDao = applicationContext.getBean(XieDao.class);
        if(xieDao==xieService.getXieDao()){ //结果为true
            System.out.println("自动装配进去的xieDao和获取容器中的xieDao相同");
        }
    }

    @Bean("xieDao2")
    public XieDao xieDao(){
        XieDao xieDao = new XieDao();
        return xieDao;
    }

}
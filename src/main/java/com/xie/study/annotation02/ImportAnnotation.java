package com.xie.study.annotation02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2018/9/16.
 * 给容器注册组建的方式：
 * 1.包扫描+组件标注注解（@Controller,@Service,@Component,@Repository）
 * 2.@Bean(一般用于引入第三方包里面的组件注册)
 * 3.@import快速给容器导入一个组件（id是导入组件类的全名）
 */
@Configuration
@Import(Color.class)
public class ImportAnnotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportAnnotation.class);
        String beanNames[] = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println(beanName);
        }
    }
}

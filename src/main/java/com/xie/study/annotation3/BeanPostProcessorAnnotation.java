package com.xie.study.annotation3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * BeanPostProcessor:在初始化的前后调用
 * 初始化前调用：postProcessBeforeInitialization，它比initMethod ，InitializingBean，@PostConstruct  还要早
 * 初始化后调用：postProcessAfterInitialization，它比initMethod ，InitializingBean，@PostConstruct 晚，但比destory()早
 * spring底层对beanpostProcessor的使用：
 *      applicationContext注入（ApplicationContextAwareProcessor）
 *      bean校验（BeanValidationPostProcessor）
 *      @Autowired（AutowiredAnnotationBeanPostProcessor）
 *      bean赋值，注入其它组件，，生命周期注解功能等
 */
@Configuration
@ComponentScan("com.xie.study.annotation3")
public class BeanPostProcessorAnnotation {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorAnnotation.class);
    }
}

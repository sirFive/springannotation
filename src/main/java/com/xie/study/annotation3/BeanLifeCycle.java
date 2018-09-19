package com.xie.study.annotation3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 在配置文件中：是通过 <bean id="" class="" init-method="" destory-method="" />
 * 在注解中通过：@Bean(initMethod = "initCar" ,destroyMethod = "destoryCar")：来指定初始化方法和销毁方法
 * bean的生命周期
 * 创建：单实例的bean在容器启动的时候调用，多实例的bean在该bean第一次使用的时候创建
 * 初始化：对象创建完成，并赋值（属性）好，调用初始化方法
 * 销毁：单例：容器关闭的时候。多例：容器不会管理这个bean,容器关闭也不会销毁。只能手动调用销毁方法
 *
 * 初始化和销毁的第二种方法：
 *  初始化：实现InitializingBean，并使用它的afterPropertiesSet()方法
 *  销毁：实现DisposableBean，并使用它的destroy()方法
 *
 *  初始化和销毁的第三种方法：
 *  初始化：@PostConstruct
 *  销毁：@PreDestroy
 */
@Configuration
@ComponentScan("com.xie.study.annotation3")
public class BeanLifeCycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(BeanLifeCycle.class);
        System.out.println("容器创建完成");

        //关闭容器
        applicationContext.close();
    }

    @Bean(initMethod = "initCar" ,destroyMethod = "destoryCar")
    public Car car(){
        return new Car();
    }
}

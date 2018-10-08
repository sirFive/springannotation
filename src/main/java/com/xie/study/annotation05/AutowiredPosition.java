package com.xie.study.annotation05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *  *  5.@Autowired标注的位置可以在构造器，参数，方法，属性
 *      1.）方法：比如setter上，setter用的参数从容器获取。@Bean标注的方法，其参数也是从容器中获取，
 *              即使你不对参数添加@Autowired
 *      2.）标在构造器上，参数从容器中获取，如果组件只有一个有参构造器，则@Autowired可以省略
 *      3.）放在参数中，参数也是从容器中获取
 */
@Component
public class AutowiredPosition {
    /**
     * 1.属性上/
     */
    @Autowired
    XieDao xieDao;

    XieService xieService;

    XieController xieController;

    /**
     * 3.构造器上
     * 标在构造器上，参数从容器中获取，如果组件只有一个有参构造器，则@Autowired可以省略
     * @param xieService
     */
    @Autowired
    public AutowiredPosition(XieService xieService) {
        this.xieService = xieService;
    }

    /**
     * 2.方法上
     * @Bean标注的方法，其参数也是从容器中获取，即使你不对参数添加@Autowired
     * 实际使用中一般不在参数中写@Autowired
     * @param xieService
     */
    @Bean
    public void getName(@Autowired XieService xieService){
        System.out.println(xieService);
    }

    /**
     * 2.方法上
     * setter方法上
     * @param xieService
     */
    @Autowired
    public void setXieService(XieService xieService) {
        this.xieService = xieService;
    }
    public XieDao getXieDao() {
        return xieDao;
    }

    public void setXieDao(XieDao xieDao) {
        this.xieDao = xieDao;
    }

    public XieService getXieService() {
        return xieService;
    }

}

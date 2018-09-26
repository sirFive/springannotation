package com.xie.study.annotation05;

/**
 * 自动注入 除了@Autowired还有@Resource和@Inject
 * @Resource:
 *          可以和@Autowired一样实现自动装配功能，默认按照组件名称（@Autowired默认按类型）进行装配。但是
 *      他不能和@Qualtify以及@Primary一起使用。不能设置(required = false)
 *  @Inject:
 *          可以和@Autowired一样实现自动装配功能，可以和@Qualitify以及@Primary一起使用。不能设置(required = false)。
 *      使用时要引入maven依赖javax.inject
 *
 * 另外：@Resource以及@Inject属于Java的规范，而@Autowired属于spring的规范。脱离spring框架后@Autowired就不能使用了
 */
public class ResourceInject {
}

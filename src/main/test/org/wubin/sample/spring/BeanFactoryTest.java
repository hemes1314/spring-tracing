package org.wubin.sample.spring;

import org.junit.Test;

/**
 * @author wubin
 * @date 2018/01/05
 **/
public class BeanFactoryTest {

    @Test
    public void test() {
        // 1.初始化
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloworld();
    }
}

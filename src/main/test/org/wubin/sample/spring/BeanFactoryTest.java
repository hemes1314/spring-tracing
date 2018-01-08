package org.wubin.sample.spring;

import org.junit.Test;
import org.wubin.sample.spring.factory.AutowireCapableBeanFactory;
import org.wubin.sample.spring.factory.BeanFactory;

/**
 * @author wubin
 * @date 2018/01/05
 **/
public class BeanFactoryTest {

    @Test
    public void test() {
        // 1.初始化
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("org.wubin.sample.spring.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloworld();
    }
}

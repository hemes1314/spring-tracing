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
    public void test() throws Exception {
        // 1.初始化
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.bean定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("org.wubin.sample.spring.HelloWorldService");

        // 3.获取bean
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!!!"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4.生成bean
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 5.获取bean
        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}

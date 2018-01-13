package org.wubin.sample.spring.factory;

import org.wubin.sample.spring.BeanDefinition;

/**
 * @author wubin
 * @date 2018/01/05
 **/
public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}

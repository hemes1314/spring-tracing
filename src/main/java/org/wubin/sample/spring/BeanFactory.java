package org.wubin.sample.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wubin
 * @date 2018/01/05
 **/
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap =
            new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}

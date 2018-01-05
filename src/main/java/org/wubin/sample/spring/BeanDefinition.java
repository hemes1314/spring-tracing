package org.wubin.sample.spring;

/**
 * @author wubin
 * @date 2018/01/05
 **/
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}

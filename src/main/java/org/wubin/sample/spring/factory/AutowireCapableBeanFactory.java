package org.wubin.sample.spring.factory;

import org.wubin.sample.spring.BeanDefinition;
import org.wubin.sample.spring.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author wubin
 * @date 2018/01/08
 **/
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
        for(PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}

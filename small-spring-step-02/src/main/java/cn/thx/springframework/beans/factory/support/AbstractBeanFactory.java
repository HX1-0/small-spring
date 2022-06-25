package cn.thx.springframework.beans.factory.support;

import cn.thx.springframework.beans.BeansException;
import cn.thx.springframework.beans.factory.BeanFactory;
import cn.thx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author THX
 * @create 2022-06-25 8:50
 * 1. 抽象类可以继承自实体类，前提是实体类有明确的构造函数，所有类的父类都是Object类，Object类就是实体类，
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {

        Object bean = getSingleton(name);
        // 获取单例的bean，如果存在就直接返回
        if(bean != null){
            return bean;
        }

        // 如果不存在，就创建这个单例bean
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}

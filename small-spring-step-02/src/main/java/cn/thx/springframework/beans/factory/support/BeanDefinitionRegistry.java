package cn.thx.springframework.beans.factory.support;

import cn.thx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author THX
 * @create 2022-06-25 9:48
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

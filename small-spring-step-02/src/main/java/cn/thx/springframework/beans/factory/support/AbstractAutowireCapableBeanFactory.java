package cn.thx.springframework.beans.factory.support;

import cn.thx.springframework.beans.BeansException;
import cn.thx.springframework.beans.factory.config.BeanDefinition;

/**
 * @author THX
 * @create 2022-06-25 9:41
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        // 处理完 Bean 对象的实例化后，直接调用 addSingleton 方法存放到单例对象的缓存中去
        addSingleton(beanName, bean);
        return bean;
    }
}

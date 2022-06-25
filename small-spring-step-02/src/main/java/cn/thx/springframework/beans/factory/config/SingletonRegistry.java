package cn.thx.springframework.beans.factory.config;

/**
 * @author THX
 * @create 2022-06-25 8:37
 * 定义一个获取单例对象的接口
 */
public interface SingletonRegistry {

    Object getSingleton(String beanName);
}

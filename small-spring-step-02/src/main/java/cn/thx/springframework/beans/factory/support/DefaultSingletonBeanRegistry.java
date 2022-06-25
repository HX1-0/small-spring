package cn.thx.springframework.beans.factory.support;

import cn.thx.springframework.beans.factory.config.SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author THX
 * @create 2022-06-25 8:39
 * 知识点：
 * 1.protected访问权限：此类中属性或⽅法可以被同⼀包下的类使⽤，也可以被不同包下的⼦类使⽤，但不能被不同包下的其他类使⽤。
 */
public class DefaultSingletonBeanRegistry implements SingletonRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    // 实现一个受保护的addSingelton方法，这个方法可以被继承此类的其他类使用
    protected void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }
}

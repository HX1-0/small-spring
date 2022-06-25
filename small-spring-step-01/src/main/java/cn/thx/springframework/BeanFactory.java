package cn.thx.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author THX
 * @create 2022-06-25 7:52
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}


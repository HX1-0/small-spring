package cn.thx.springframework.test;

import cn.thx.springframework.beans.factory.config.BeanDefinition;
import cn.thx.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.thx.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author THX
 * @create 2022-06-25 10:02
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        //4.第二次获取bean
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}

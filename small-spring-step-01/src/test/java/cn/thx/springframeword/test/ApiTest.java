package cn.thx.springframeword.test;

import cn.thx.springframeword.test.bean.UserService;
import cn.thx.springframework.BeanDefinition;
import cn.thx.springframework.BeanFactory;
import org.junit.Test;

/**
 * @author THX
 * @create 2022-06-25 8:05
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}

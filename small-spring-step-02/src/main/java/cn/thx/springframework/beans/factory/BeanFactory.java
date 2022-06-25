package cn.thx.springframework.beans.factory;

import cn.thx.springframework.beans.BeansException;

/**
 * @author THX
 * @create 2022-06-25 9:24
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}

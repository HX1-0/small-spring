package cn.thx.springframework.beans.factory.config;

/**
 * @author THX
 * @create 2022-06-25 8:24
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}

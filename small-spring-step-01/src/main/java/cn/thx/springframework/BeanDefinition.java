package cn.thx.springframework;

/**
 * @author THX
 * @create 2022-06-25 7:51
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}

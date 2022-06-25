package cn.thx.springframework.beans;

/**
 * @author THX
 * @create 2022-06-25 9:25
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }

}

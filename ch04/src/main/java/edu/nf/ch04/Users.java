package edu.nf.ch04;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class Users implements InitializingBean, DisposableBean{

    public Users ()
    {
        System.out.println("执行构造方法");
    }

    public void init()
    {
        System.out.println("初始化方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet方法");
    }

    public void myDestory()
    {
        System.out.println("myDestory方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory方法");
    }
}

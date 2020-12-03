package edu.nf.obj02;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class Students implements InitializingBean, DisposableBean {


    //案例三：使用InitializingBean接口的afterPropertiesSet方法初始化
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean接口的afterPropertiesSet方法初始化");
    }
    //案例一：直接初始化方法
    public void init ()
    {
        System.out.println("直接初始化方法");
    }

    //案例二：直接销毁方法
    public void destory()
    {
        System.out.println("直接销毁方法");
    }
    //案例四:使用Disposable接口的destory方法销毁
    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable接口的destory方法");
    }

    public void say()
    {
        System.out.println("Good morning");
    }



}

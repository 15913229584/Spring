package edu.nf.obj02;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
//案例五：处理器
public class myProcessor implements BeanPostProcessor {

    //初始化前
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization,初始化之前");
        return bean;
    }

    //初始化后
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization，初始化之后");
        return bean;

    }


}

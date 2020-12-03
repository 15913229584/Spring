package edu.nf.ch04.Processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 * BeanPostProcessor这个接口称之为Bean的后处理器，它可以在Spring容器实例化
 * bean对象并完成依赖注入，在执行bean的初始化方法（如：InitializeingBean接口）
 * 自定义的init-method)前后执行，用于添加一些其他的处理逻辑。（注意：这个接口是针对所有的bean）
 */
public class MyProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization");
        return bean;

    }
}

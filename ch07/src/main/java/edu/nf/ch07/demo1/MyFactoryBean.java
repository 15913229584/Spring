package edu.nf.ch07.demo1;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 * 自定义factoryBean,用于自定义对象
 * Spring容器会调用FactoryBean的getObject方法，将返回的对象自动纳入到IOC容器中
 */
public class MyFactoryBean implements FactoryBean<UserService> {

    //返回具体某个实现类的bean
    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }

    //返回Bean的类型
    @Override
    public Class<?> getObjectType() {
        return UserServiceImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 * 自定义一个工厂给Spring
 * 来创建bean对象,这个自定义工厂本身也会纳入Spring
 * 容器中管理，因此命名时通常都是XxxFactoryBean
 */
public class UsersFactoryBean {
    public Users build()
    {
        return new Users();
    }
}

package edu.nf.ch05.service;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UserDaoImpl;
import edu.nf.ch05.entity.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 *
 *
 */


public class UserServiceImpl implements UserService{

    //提供一个set方法给Spring容器，这个方法就是注入的入口方法。
    //那么Spring就会调用这个方法，从容器中将一个UserDao的实现类
    //给注入进来，赋值给上面的接口
    private UserDao userDao;

    public void setDao(UserDao dao)
    {
        this.userDao =dao;
    }
    @Override
    public void add(Users users) {
        userDao.save(users);
    }
}

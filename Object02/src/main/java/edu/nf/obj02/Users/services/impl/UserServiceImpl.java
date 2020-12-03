package edu.nf.obj02.Users.services.impl;

import edu.nf.obj02.Users.dao.Beans.UserDao;
import edu.nf.obj02.Users.entity.Users;
import edu.nf.obj02.Users.services.beans.UserService;
import org.springframework.context.ApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl()
    {
        this.userDao =userDao;
    }
    public UserServiceImpl(UserDao userDao)
    {
        this.userDao =userDao;
    }

    public void setDao(UserDao dao)
    {
        this.userDao =dao;
    }
    @Override
    public void update(Users users) {
        userDao.update(users);
        userDao.say();
    }
}

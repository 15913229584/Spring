package edu.nf.ch09.service.impl;

import edu.nf.ch09.controller.UserController;
import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/3 0003
 */
//@Component("service")
@Service("service")
public class UserServiceImpl implements UserService {

    //注入UserDao
    private UserService userService;

    //构造方法注入
    /*@Autowired
        public UserController (UserService userService)
    {
        this.userService =userService;
    }
     */


    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userService = userService;
    }

    @Override
    public void save() {
        System.out.println("UserService添加");
    }

    public void add()
    {
        userService.save();
    }
    //@PostConstruct注解标识自定义初始化方法
    @PostConstruct
    public void init()
    {
        System.out.println("执行自定义的init方法");
    }

    //@PreDestroy注解标识自定义销毁的方法
    @PreDestroy
    public void destory()
    {
        System.out.println("执行自定义的销毁方法");
    }
}

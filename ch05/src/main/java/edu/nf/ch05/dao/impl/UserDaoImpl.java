package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;

import java.lang.annotation.Annotation;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void save(Users users) {
        System.out.println("添加用户");
    }
}

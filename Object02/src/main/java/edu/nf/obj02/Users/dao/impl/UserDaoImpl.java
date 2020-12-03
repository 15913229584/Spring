package edu.nf.obj02.Users.dao.impl;

import edu.nf.obj02.Users.dao.Beans.UserDao;
import edu.nf.obj02.Users.entity.Users;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("Hello,everyone");
    }

    @Override
    public void update(Users users) {
        System.out.println("update user_info set name =‘张三’ where id =??? ");
    }

}

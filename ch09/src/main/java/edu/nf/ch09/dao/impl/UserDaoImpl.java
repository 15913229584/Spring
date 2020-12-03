package edu.nf.ch09.dao.impl;

import edu.nf.ch09.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/3 0003
 */
//@Component("dao")
//可以使用@Repository注解标识dao层
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("添加");
    }
}

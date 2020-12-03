package edu.nf.ch08.test;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Test {

    @org.junit.Test
    public void testUser()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserDao usersDao = context.getBean("userDao",UserDao.class);
        usersDao.listUser();
        List<Users> usersList = usersDao.listUser();
        usersList.forEach(users -> System.out.println(users.getId()));
    }
}

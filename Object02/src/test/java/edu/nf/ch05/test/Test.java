package edu.nf.ch05.test;

import edu.nf.obj02.Students;
import edu.nf.obj02.Users.dao.Beans.UserDao;
import edu.nf.obj02.Users.dao.impl.UserDaoImpl;
import edu.nf.obj02.Users.entity.Users;
import edu.nf.obj02.Users.services.beans.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class Test {

    public void testStudent()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean2.xml");
        context.getBean("students",Students.class);
        ((ClassPathXmlApplicationContext)context).close();
    }
    @org.junit.Test
    public void setTest()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("objectBean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        Users users = new Users();
        userService.update(users);
    }
}

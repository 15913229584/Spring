package edu.nf.obj03.test;

import edu.nf.obj03.demo2.dao.UserDao;
import edu.nf.obj03.demo2.entity.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Test2 {

    @Test
    public void testProxy()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("proxyBean.xml");
        UserDao dao =context.getBean("userDao",UserDao.class);
        List<Users> users = dao.listUser();
        users.forEach(users1 -> System.out.println(users1.getId()));
    }
}

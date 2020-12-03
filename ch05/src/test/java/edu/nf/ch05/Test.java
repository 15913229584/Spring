package edu.nf.ch05;

import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class Test {
    @org.junit.Test
    public void testContainer()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        Users users = new Users();
        userService.add(users);
    }

}

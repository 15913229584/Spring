package edu.nf.ch07.test;

import edu.nf.ch07.demo1.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Test {
    @org.junit.Test
    public void testBean()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        UserService userService = context.getBean("UserService", UserService.class);
        System.out.println(userService);

        UserService userService1 = context.getBean("UserService",UserService.class);
        System.out.println(userService1);
    }
}

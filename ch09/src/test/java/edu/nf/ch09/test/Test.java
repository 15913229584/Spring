package edu.nf.ch09.test;

import edu.nf.ch09.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/3 0003
 */
public class Test {
    @org.junit.Test
    public void testIOC()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        UserController userController = context.getBean("controller",UserController.class);
        userController.add();
    }
}

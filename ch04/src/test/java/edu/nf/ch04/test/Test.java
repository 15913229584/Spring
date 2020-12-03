package edu.nf.ch04.test;

import edu.nf.ch04.People;
import edu.nf.ch04.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/1 0001
 */
public class Test {

    @org.junit.Test
    public void listTest()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringMethod.xml");
        context.getBean("users", Users.class);
        //在实现类中会提供一个close方法用于关闭容器，因此当关闭容器前
        //都会执行所有的Bean的destory方法
        ((ClassPathXmlApplicationContext)context).close();
    }
}

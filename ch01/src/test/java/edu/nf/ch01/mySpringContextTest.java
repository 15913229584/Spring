package edu.nf.ch01;

import edu.nf.ch01.factory.UserFactory;
import edu.nf.ch01.factory.UsersFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 * 在Spring框架当中，工厂分为两类，
 * 一种是BeanFactory，另一种是ApplicationContext,
 * BeanFactory是最基础的bean工厂，
 * 而ApplicationContext针对BeanFactory做了很多的功能扩展和增强
 * 官方也推荐我们使用AppliactionContext这个接口来操作Spring容器
 */
public class mySpringContextTest {

    @Test
    public void test()
    {
        //初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("mySpringContext.xml");
        //从容器中获取Bean对象，根据id来获取
        Users users =(Users)context.getBean("user");
        users.say();
        //Users users1 =context.getBean("user",Users.class);
        //users1.say();
    }
    @Test
    public void testRun()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("mySpringContext.xml");
        People people = (People)context.getBean("peopleRun");
        people.run();
    }
    @Test
    public void Testbulid()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("mySpringContext.xml");
        Users users = context.getBean("user1",Users.class);
        users.say();
    }
@Test
    public void TestCreate()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("mySpringContext.xml");
        Users users = context.getBean("user2",Users.class);
        users.say();
    }
}

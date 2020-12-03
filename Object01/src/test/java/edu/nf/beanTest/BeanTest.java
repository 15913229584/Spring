package edu.nf.beanTest;

import edu.nf.obj01.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class BeanTest {
    //第一个案例
    @Test
    public void testUsers()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean.xml");
        Users users = context.getBean("users",Users.class);
        users.say();
    }
    //第二个案例
    @Test
    public void testPeople()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("objectBean.xml");
        People people = context.getBean("people",People.class);
        people.say();
    }
    //第三个案例 创建Bean工厂
    @Test
    public void testBuild()
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("objectBean.xml");
        People people = context.getBean("people",People.class);
        people.say();
    }
    //第四个案例 创建静态工厂
    @Test
    public void testCreate()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean.xml");
        Animals animals =context.getBean("animals",Animals.class);
        animals.cat();
    }

    //第五个案例 作用域
    @Test
    public void testArea()
    {
        ApplicationContext context1 =new ClassPathXmlApplicationContext("objectBean.xml");
        People people1 =context1.getBean("PeopleA1",People.class);
        People people2 =context1.getBean("PeopleA1",People.class);

        people1.say();
        System.out.println(people1);
        people2.say();
        System.out.println(people2);

        System.out.println("------------------------------------------------");

        ApplicationContext context2 = new ClassPathXmlApplicationContext("objectBean.xml");
        People people3 = context2.getBean("PeopleA2",People.class);
        People people4 = context2.getBean("PeopleA2",People.class);

        people3.say();
        System.out.println(people3);
        people4.say();
        System.out.println(people4);

    }

    //第六个案例 id与name
    @Test
    public void testName()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean.xml");
        Rabbit rabbit = context.getBean("rabbit",Rabbit.class);
        System.out.println(rabbit);

        System.out.println("-------------------------------------------------");

        Rabbit r1 = context.getBean("r1",Rabbit.class);
        Rabbit r2 = context.getBean("r2",Rabbit.class);
        Rabbit r3 = context.getBean("r3",Rabbit.class);

        r1.action();
        r2.action();
        r3.action();
    }

    //第一个练习
    @Test
    public void testPanada()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean.xml");

        Panada panada1 = context.getBean("p1",Panada.class);
        Panada panada2 = context.getBean("p2",Panada.class);
        Panada panada3 = context.getBean("p3",Panada.class);
        panada1.condiition();
        panada2.condiition();
        panada3.condiition();
    }
}

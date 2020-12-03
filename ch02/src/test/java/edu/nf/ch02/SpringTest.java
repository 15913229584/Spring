package edu.nf.ch02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class SpringTest {
    @Test
    public void testSqy()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springList.xml");
        People people = context.getBean("say",People.class);
        People people1 = context.getBean("say",People.class);
        people.say();
        System.out.println(people);
        people1.say();
        System.out.println(people1);
    }
}

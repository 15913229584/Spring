package edu.nf.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class TestPeople {

    public void testSayIdAddName()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spingPeople.xml");
        PeoPle peoPle =context.getBean("say",PeoPle.class);
        System.out.println(peoPle);
        PeoPle p1 = context.getBean("p1",PeoPle.class);
        PeoPle p2 = context.getBean("p2",PeoPle.class);
        PeoPle p3 = context.getBean("p3",PeoPle.class);

        p1.say();
        p2.say();
        p3.say();
    }
}

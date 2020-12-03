package Test;

import edu.nf.ch06.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Test {
    @org.junit.Test
    public void testUsers() {
        ApplicationContext context = new ClassPathXmlApplicationContext("UserContext.xml");
        Users users = context.getBean("users", Users.class);
        System.out.println(users.getUserName());
        System.out.println(users.getAge());
        users.getAddress().forEach(addr -> System.out.println(addr));
        users.getCard().forEach((k,v)->System.out.println(k+":"+v));
        System.out.println(users.getProp().getProperty("aa"));
        System.out.println(users.getProp().getProperty("bb"));
    }
}

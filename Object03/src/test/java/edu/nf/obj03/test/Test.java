package edu.nf.obj03.test;

import edu.nf.obj03.demo1.Student;
import edu.nf.obj03.demo1.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class Test {
    @org.junit.Test
        public void testStudent()
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("DataBeans.xml");
            Student student = context.getBean("student",Student.class);
            System.out.println(student.getId());
            System.out.println(student.getName());
            System.out.println(student.getSex());
            System.out.println(student.getAge());
            student.getHobby().forEach(hobby->System.out.println(hobby));
            student.getSubject().forEach((k,v)->System.out.println(k+":"+v));
            System.out.println(student.getProp().getProperty("One"));
            System.out.println(student.getProp().getProperty("Two"));
        }

        @org.junit.Test
        public void testTeacher()
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("DataBeans.xml");
            Teacher teacher = context.getBean("teacher",Teacher.class);
            System.out.println(teacher.getId());
            System.out.println(teacher.getName());
            System.out.println(teacher.getSex());
            System.out.println(teacher.getAge());
            teacher.getHobby().forEach(hobby->System.out.println(hobby));
            teacher.getSubject().forEach((k,v)->System.out.println(k+":"+v));
            System.out.println(teacher.getProp().getProperty("One"));
            System.out.println(teacher.getProp().getProperty("Two"));
        }
}

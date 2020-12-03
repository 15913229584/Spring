package edu.nf.ch09.controller;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/3 0003
 */
//Component注解标识类，表示为容器受管理的Bean
//value属性用于指定Bean的id,如果不指定，默认就是类名
//将首字母变为小写作为id
//@Component("controller")
//从3.0开始，每一层都有对应的注解额来标识，作用和
//@Component注解时一样，标识起来更加明确
@Controller("controller")
//@Scope注解用于Bean的作用域，作用和xml中的一致
@Scope("prototype")
public class UserController {
//也可以使用@Resource注解来注入，它是javax包下提供的注解
//Spring可以支持此注解只能标注在字段以及set方法上，不能标注在构造方法上
@Resource(name="stuService")
    //注入UserService

    private UserService userService;
    //注入对象,Autowired注解用于完成注入配置，
    //可以标识在set方法上，构造方法上，字段上
    //当实现类只有一个时，Spring会自动找到它并直接注入进来
    //有多个实现类时，就必须结合
    //Qualfier注解一起使用，这个注解的作用是
    //指定要注入哪一个类
    @Autowired
    //通过@Qualifier指定Bean的id
    @Qualifier("service")

    public void setUserService(UserService userService)
    {
        this.userService =userService;
    }

    //
    public void add()
    {
        userService.save();
    }
}

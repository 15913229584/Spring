package edu.nf.ch09;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/3 0003
 */
@Service("stuService")
//@Primary注解,优先注入的Bean
@Primary
public class StuServiceImpl implements UserService {
    //字段注入

    @Autowired

    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("stuService添加");
    }
    public void add()
    {
        userDao.save();
    }
}

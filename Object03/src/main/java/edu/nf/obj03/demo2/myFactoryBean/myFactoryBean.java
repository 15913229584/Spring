package edu.nf.obj03.demo2.myFactoryBean;

import edu.nf.obj03.demo2.utils.SqlUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
//直接使用接口进行方法的处理
//通过factory自定义Bean实例
//T泛型的作用是可以容纳所有的类和实例
public class myFactoryBean<T> implements FactoryBean<T> {
//动态创建代理需要一个接口传入，返回一个代理，而这个接口可以通过set方法进行注入

    //注入一个最大泛型任意接口的daoInterface对象
    private Class<T> daoInterface;

    //使用set方法来注入任意dao接口的Class对象
    public void setDaoInterface(Class<T> daoInterface)
    {
        this.daoInterface = daoInterface;
    }


    //和mybatis的实现类一样，返回session.getMapper方法的代理对象，通过IOC容器调用getObject方法之后，
    //这个接口的实例就能放入容器中
    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession = SqlUtils.getSqlSession(true);
        T UsersProxy  = sqlSession.getMapper(daoInterface);

        return UsersProxy;
    }

    //返回一个接口的class对象，因为我们现在注入了一个任意dao类型的daoInterface接口对象
    //所以我们可以使用daoInterface
    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

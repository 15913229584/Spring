package edu.nf.ch08.myFactotyBean;

import edu.nf.utils.Sqlutils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
//T表示任意Dao接口的类型
public class MapperFactoryBean<T> implements FactoryBean<T> {

    //JDK动态代理创建代理对象时需要传入一个接口
    //而这个接口可以通过set方法注入进来
    private Class<T> daoInterface;
    /*
    * 提供一个方法set注入一个Dao的接口的Class对象
    * */
    public void setDaoInterface(Class<T> daoInterface)
    {
        this.daoInterface =daoInterface;
    }
    //当IOC容器调用getObject方法时，返回的是sqlSession的getMapper
    //的代理对象，这个代理对象就可以放入容器中管理
    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession = Sqlutils.getSqlSession(true);
        T mapperProy = sqlSession.getMapper(daoInterface);
        return mapperProy;
    }

    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

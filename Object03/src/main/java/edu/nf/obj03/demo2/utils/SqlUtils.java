package edu.nf.obj03.demo2.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 沧海归心心不眠
 * @date 2020/12/2 0002
 */
public class SqlUtils {
        private static SqlSessionFactory sqlSessionFactory;

        static
        {
                try
                {
                        InputStream is = Resources.getResourceAsStream("config.xml");
                        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                        sqlSessionFactory = builder.build(is);
                }catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
        public static SqlSession getSqlSession(boolean autoCommit)
        {
                return sqlSessionFactory.openSession(autoCommit);
        }
}

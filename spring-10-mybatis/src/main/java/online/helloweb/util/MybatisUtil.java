package online.helloweb.util;

import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jack
 * @date 2019/12/11 0011
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        //使用mybatis第一步，获取sqlSession对象
        try {
            String resources = "mybatis-config.xml";
            InputStream in = Resources.getResourceAsStream(resources);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

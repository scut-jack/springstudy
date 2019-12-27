import online.helloweb.mapper.UserMapper;
import online.helloweb.pojo.User;
import online.helloweb.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class MyTest {
    @Test
    public void test() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sessionFactory.openSession();
        //以上全部集成在MybatisUtil中了
        UserMapper mapper = MybatisUtil.getSqlSession().getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser(1,"小王");
        List<User> userList = mapper.selectUserALL();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}

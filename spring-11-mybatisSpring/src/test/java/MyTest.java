import online.helloweb.mapper.UserMapper;
import online.helloweb.pojo.User;
import online.helloweb.service.UserServiceImpl;
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
    public void Test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        UserServiceImpl service = new UserServiceImpl(mapper);
//        System.out.println(service.selectUser());
//        System.out.println(userMapper.selectUser1(1));
        for (User user : service.selectUser()) {
            System.out.println(user);
        }
   }
}

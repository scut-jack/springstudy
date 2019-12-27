package online.helloweb.mapper;

import online.helloweb.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author jack
 * @date 2019/11/5 0005
 */
public class UserMapperimpl2 extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
    @Override
    public User selectUser1(int id) {
        return getSqlSession().getMapper(UserMapper.class).selectUser1(1);
    }
}

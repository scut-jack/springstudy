package online.helloweb.service;

import online.helloweb.mapper.UserMapper;
import online.helloweb.pojo.User;

import java.util.List;

/**
 * @author jack
 * @date 2019/12/11 0011
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper){
        this.userMapper=userMapper;
    }
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public User selectUser1(int id) {
        return userMapper.selectUser1(1);
    }
}

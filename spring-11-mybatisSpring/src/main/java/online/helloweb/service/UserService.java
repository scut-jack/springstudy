package online.helloweb.service;

import online.helloweb.pojo.User;

import java.util.List;

/**
 * @author jack
 * @date 2019/12/11 0011
 */
public interface UserService {
    public List<User> selectUser();
    public User selectUser1(int id);
}

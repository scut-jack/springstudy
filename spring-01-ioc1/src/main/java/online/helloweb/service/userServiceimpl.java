package online.helloweb.service;

import online.helloweb.dao.userDao;
import online.helloweb.dao.userDaoimpl;
import online.helloweb.dao.userDaomysqlimpl;

/**
 * @author jack
 * @date 2019/10/31 0031
 */
public class userServiceimpl implements userService {
    //    private userDao userDao1 = new userDaomysqlimpl();
    private userDao userDao1;
    //    利用set进行动态实现值的注入
    public void setUserDao(userDao userDao1) {
        this.userDao1 = userDao1;
    }

    public void getUser1() {
        userDao1.getUser();
    }
}

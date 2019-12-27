package online.helloweb.My.demo02;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
//原有类
public class UserServiceimpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户！");
    }

    public void delete() {
        System.out.println("删除了一个用户！");
    }

    public void update() {
        System.out.println("修改了一个用户！");
    }

    public void query() {
        System.out.println("查询到一个用户！");
    }
}

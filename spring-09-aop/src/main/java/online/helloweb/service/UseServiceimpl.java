package online.helloweb.service;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class UseServiceimpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查询到一个用户");
    }
}

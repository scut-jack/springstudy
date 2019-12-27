package online.helloweb.My.demo02;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
//静态代理类 在实现原来被它代理的类的方法上增加实现更多的方法
//缺点就是要复写很多方法，代码量太大，因此引出动态代理来解决这一问题
public class UserServiceProxy implements UserService{
    private UserServiceimpl userService1;

    public void setUserservice(UserServiceimpl userService1) {
        this.userService1 = userService1;
    }

    public void add() {
        log("add");
        userService1.add();
    }

    public void delete() {
        log("delete");
        userService1.delete();
    }

    public void update() {
        log("update");
        userService1.update();
    }

    public void query() {
        log("query");
        userService1.query();
    }
    public void log(String msg){
        System.out.println("[DEBUG]输出"+msg+"日志");
    }
}

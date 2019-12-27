package online.helloweb.My.demo02;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
//改动原有代码是大忌，因此使用代理模式（不用改动原有代码）
public class Client {
    public static void main(String[] args) {
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserservice(new UserServiceimpl());
        proxy.add();
        proxy.delete();
    }
}

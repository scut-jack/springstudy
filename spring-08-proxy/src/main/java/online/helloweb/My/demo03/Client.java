package online.helloweb.My.demo03;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        Host1 host1 = new Host1();
        //代理角色 现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();//这里的proxy就是动态生成的，我们并没有去写它
        proxy.rent();
    }
}

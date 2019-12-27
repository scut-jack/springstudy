package online.helloweb.My.demo01;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
//代理模式 代码解释
public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();
        //代理，中介帮房东租房子，但是呢？代理一般会有一些附属操作
        Proxy proxy = new Proxy(new Host());
        //你不用找房东，直接找中介租房即可
        proxy.rent();
    }
}

package online.helloweb.My.demo01;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class Proxy implements Rent{
    private Host host;
    public Proxy(){

    }
    public Proxy(Host host){
        this.host=host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        free();

    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }
    //收中介费
    public void free(){
        System.out.println("收中介费！");
    }
    //签合同
    public void hetong(){
        System.out.println("签合同！");
    }
}

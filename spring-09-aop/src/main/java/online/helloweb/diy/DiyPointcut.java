package online.helloweb.diy;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class DiyPointcut {
    public void before(){
        System.out.println("======方法执行前=======");
    }
    public void after(){
        System.out.println("======方法执行后=======");
    }
}

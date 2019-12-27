import online.helloweb.dao.userDaoimpl;
import online.helloweb.dao.userDaomysqlimpl;
import online.helloweb.service.userService;
import online.helloweb.service.userServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jack
 * @date 2019/10/31 0031
 */
public class Mytest{
    public static void main(String[] args) {
//        //用户实际调用的是业务层，dao层用户不接触
//        userService userService=new userServiceimpl();
//        ((userServiceimpl) userService).setUserDao(new userDaomysqlimpl());
//        userService.getUser1();
        /*获取ApplicationContext;拿到spring的容器*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /*我们的对象现在都在Spring中管理了，要使用直接从其中取出即可*/
        userServiceimpl hello = (userServiceimpl) context.getBean("userServiceimpl");
        hello.getUser1();
    }
}

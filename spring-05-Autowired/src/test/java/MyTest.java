import online.helloweb.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jack
 * @date 2019/11/1 0001
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person",Person.class);
        person.getCat2().shout();
        person.getDog2().shout();

    }
}

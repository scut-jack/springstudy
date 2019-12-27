package online.helloweb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author jack
 * @date 2019/11/2 0002
 */
/*这里这个注解的意思是说明了这个类被spring接管了，注册到了容器中*/
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("dawang")//属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

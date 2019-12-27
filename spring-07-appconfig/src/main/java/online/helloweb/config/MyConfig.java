package online.helloweb.config;

import online.helloweb.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jack
 * @date 2019/11/2 0002
 */
@Configuration
//这个也会被spring容器托管，注册到容器中，因为他本来就是一个@component
//@Configuration代表这是一个配置类，就和我们之前看的beans.xml
@ComponentScan("online.helloweb")
@Import(MyConfig2.class)
public class MyConfig {
    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}

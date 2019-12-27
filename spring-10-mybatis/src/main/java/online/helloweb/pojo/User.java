package online.helloweb.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
@Data
//为此类中的成员变量自动创建get、set方法
@Alias("user")
public class User {
    private int id;
    private String name;
    private String pwd;

}

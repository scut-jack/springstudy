package online.helloweb.mapper;

import online.helloweb.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public interface UserMapper {

    public User selectUser(@Param("id") int id, @Param("name") String name);
    public List<User> selectUserALL();
}

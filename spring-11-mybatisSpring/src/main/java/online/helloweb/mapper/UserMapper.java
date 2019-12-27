package online.helloweb.mapper;

import online.helloweb.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public interface UserMapper {
    @Select("select*from user")
    public List<User> selectUser();
    @Select("select*from user where id=#{id}")
    public User selectUser1(int id);

}

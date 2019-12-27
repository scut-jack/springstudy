package online.helloweb.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class Log implements MethodBeforeAdvice {
    //method:要执行的目标对象方法
    //args：参数
    //target：目标对象
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}

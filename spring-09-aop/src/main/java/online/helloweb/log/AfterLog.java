package online.helloweb.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author jack
 * @date 2019/11/3 0003
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue是返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了 "+method.getName()+"方法，返回值结果为"+returnValue);
    }
}

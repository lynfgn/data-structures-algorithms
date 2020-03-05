package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zcj
 * @date 2020/1/710:38
 */
public class DynProxyLowyer implements InvocationHandler {
    /**
     *被代理对象
     */
    private Object target;
    public DynProxyLowyer(Object obj){
        this.target=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展："+method.getName());
        return method.invoke(target,args);
    }
}

package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zcj
 * @date 2020/1/710:51
 */
public class ProxyFactoryDyn {

    public static Object getProxy(Object target){
        InvocationHandler handler = new DynProxyLowyer(target);
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
    }
}

package designpatterns.proxy;

/**
 * @author zcj
 * @date 2020/1/617:05
 */
public class ProxyFactoryStatic {
    public static ILowSuit getProxy(){
        return new ProxyLowyer(new DogWang());
    }
}

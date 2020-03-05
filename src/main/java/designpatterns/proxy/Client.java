package designpatterns.proxy;

/**
 * @author zcj
 * @date 2020/1/617:14
 */
public class Client {
    public static void main(String[] args) {
        /*ProxyLowyer proxyLowyer = (ProxyLowyer) ProxyFactoryStatic.getProxy();
        proxyLowyer.submit("工资流水在此！");
        proxyLowyer.defend();*/
        ILowSuit proxy = (ILowSuit) ProxyFactoryDyn.getProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}

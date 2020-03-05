package designpatterns.proxy;

/**
 * @author zcj
 * @date 2020/1/616:18
 */
public class ProxyLowyer implements ILowSuit {

    ILowSuit plaintif;//持有被代理对象
    public ProxyLowyer(ILowSuit plaintif){
        this.plaintif = plaintif;
    }
    @Override
    public void submit(String proof) {
        plaintif.submit(proof);
    }

    @Override
    public void defend() {
        plaintif.defend();
    }
}

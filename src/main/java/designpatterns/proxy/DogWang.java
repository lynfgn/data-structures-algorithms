package designpatterns.proxy;


/**
 * @author zcj
 * @date 2020/1/616:13
 */
public class DogWang implements ILowSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路，证据如下：%s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("铁证如山，%s还钱","马旭"));
    }
}

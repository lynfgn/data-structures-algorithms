package designpatterns.proxy;

/**
 * @author zcj
 * @date 2020/1/710:31
 */
public class CuiHuaNiu implements ILowSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠钱跑路，证据如下：%s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("铁证如山，%s还牛翠花血汗钱！","马旭"));
    }
}

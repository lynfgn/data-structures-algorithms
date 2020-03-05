package designpatterns.observer;

/**
 * @author zcj
 * @date 2020/1/317:20
 * 喜羊羊
 */
public class HappySheep implements Observer{
    @Override
    public String getName() {
        return "喜羊羊";
    }

    @Override
    public void update(String msg) {
        System.out.println("喜羊羊收到信息："+msg);
    }
}

package designpatterns.observer;

/**
 * @author zcj
 * @date 2020/1/316:56
 * 观察者接口
 */
public interface Observer {

    String getName();

    /**
     * 通知更新方法
     * @param msg
     */
    void update(String msg);
}

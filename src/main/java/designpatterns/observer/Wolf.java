package designpatterns.observer;

/**
 * @author zcj
 * @date 2020/1/610:21
 */
public class Wolf extends  Subject {

    public void invade(){

        System.out.println("灰太狼：我要搞事情了！");
        //通知所有观察者
        notifyAllObserver();
    }
}

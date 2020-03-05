package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zcj
 * @date 2020/1/316:56
 * 被观察的主题、对象抽象
 */
public abstract class Subject {
    /**
     *     持有观察者对象的集合
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 登记观察者
     * @param observer
     */
    public void adttach(Observer observer){
        observerList.add(observer);
        System.out.println("添加了观察者："+observer.getName());
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void dettach(Observer observer){
        observerList.remove(observer);
        System.out.println("删除了观察者："+observer.getName());
    }

    /**
     * 通知所有观察者
     */
    public void notifyAllObserver(){
        for (Observer o :
                observerList) {
            o.update("灰太狼要搞事情了！");
        }
    }
}

package designpatterns.observer;

/**
 * @author zcj
 * @date 2020/1/610:25
 */
public class Client {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Observer happySheep = new HappySheep();
        wolf.adttach(happySheep);
        wolf.invade();
    }
}

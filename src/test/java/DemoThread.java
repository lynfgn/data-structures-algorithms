/**
 * @author zcj
 * @date 2019/12/2414:22
 */
public class DemoThread {
    final static Object person =new Object();
    public static class T1 extends Thread{
        public void run(){
            synchronized (person){
                System.out.println(System.currentTimeMillis()+"T1 come");
                try{
                    System.out.println(System.currentTimeMillis()+"T1 wait");
                    person.wait();
                }catch (InterruptedException r){
                    r.getStackTrace();
                }
                System.out.println(System.currentTimeMillis()+"T1 over");
            }
        }
    }
    public static class T2 extends Thread{
        public void run(){
            synchronized (person){
                System.out.println(System.currentTimeMillis()+"T2 come");
                person.notify();
                System.out.println(System.currentTimeMillis()+"T2 over");
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException r){
                    r.getStackTrace();
                }

            }
        }
    }

    public static void main(String args[]){
        try{
            Thread thread1=new T1();
            Thread thread2=new T2();
            thread1.start();
            thread2.start();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

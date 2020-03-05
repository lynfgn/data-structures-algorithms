package basis;

/**
 * @author zcj
 * @date 2019/12/119:37
 */
public class Base {

    private String baseName="base";
    public Base(){
        callName();
    }
    public void callName(){
        System.out.println(baseName);
    }
    static class Sub extends Base{
        private String subName="sub";
        public void callName(){
            System.out.println(subName);
        }
    }

    public static void main(String[] args) {
        Base o =new Sub();
    }
}

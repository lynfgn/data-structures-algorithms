/**
 * @author zcj
 * @date 2019/12/1523:49
 */
public class TempTest {

    public static void main(String[] args) {
        /*int i =1;
        i = i++;
        int j= i++;
        int k = i+ ++i*i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);*/
        short s1 =1;
        s1+=1;
        System.out.println(s1);
        int i1=s1++;
        System.out.println(i1);
        i1=s1+1;
        System.out.println(i1);
        System.out.println("Hello,World".substring(0,"Hello,World".indexOf(",")));
    }
}

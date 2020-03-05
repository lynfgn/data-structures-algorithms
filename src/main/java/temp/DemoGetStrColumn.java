package temp;

import java.util.Scanner;

/***
 * 字符串分列提取
 * 例如：str = "jaogh;jioge;jlka"  通过";"截取为字符数组后，输入:1，得到:jioge
 */
public class DemoGetStrColumn {

    public static void main(String[] args) {
        System.out.println("请输入一串含有”；“的字符串：");
        Scanner scannerStr = new Scanner(System.in);
        String str = scannerStr.next();
        System.out.println("请输入截取后的字符串下标数字：");
        Scanner scannerInt = new Scanner(System.in);
        int index = scannerInt.nextInt();
        String s = dealStr(str, index);
        System.out.println("结果为："+s);
    }

    public static String dealStr(String str,int index){
        String[] split = str.split(";");
        return split[index];
    }
}

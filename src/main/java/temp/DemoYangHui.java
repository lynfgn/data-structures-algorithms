package temp;

import java.util.Scanner;

/**
 * @author zcj
 * @date 2020/1/817:34
 * 杨辉三角
 */
public class DemoYangHui {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,k;//组合数公式中的n k

        System.out.println("请输入组合数公式的n和k：");

        n=input.nextInt();

        k=input.nextInt();

        System.out.println("组合结果为"+ZuHe(n,k));

    }

    public static long ZuHe(int a,int b) //构造递归函数

    {

        if(b==0){
            return 1;
        }else {

            if(a==1){
                return 1;
            }else {

                if(a==b) {
                    return 1;
                }else {

                    return (ZuHe(a-1,b-1)+ZuHe(a-1,b));
                }

            }

        }

    }

}

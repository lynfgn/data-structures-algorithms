package temp;

import java.util.Scanner;

/**
 * @author zcj
 * @date 2020/1/911:23
 * 递归的应用--回文
 */
public class DemoHuiwen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String s=input.next();//输入字符串

        int i,j;

        i=0;//为字符串第一个字符

        j=s.length()-1;//最后一个字符  ded

        System.out.println("是否是回文:"+HuiWen(s,i,j));
}

    public static boolean HuiWen(String s,int i,int j)//判断字符串是否回文

    {

        if(i==j)

        {
            return true;
        }

        else

        if((i-1)==j)

        {
            return true;
        }

        return (s.charAt(i)==s.charAt(j))&&HuiWen(s,i+1,j-1);

    }
}

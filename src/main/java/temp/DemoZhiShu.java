package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 数字分解成2个质数相加，输入数字不超过1000000。输出：总共有多少种分解方式
 * @date 2020/3/110:46
 */
public class DemoZhiShu {


    /**
     *数字分解成2个质数相加，输入数字不超过1000000。输出：总共有多少种分解方式
     * 除了1和本身
     * 2,3,5,7,
     * 11,13,17,19,renyi
     * 23,29,
     * 31,37,
     * 41,43,47,
     * 53,59,
     * 61,67,
     * 71,73,79,
     * 83,89,
     * 97,
     * 101
     *
     */
    public static Integer zhiShu(Integer integer){
        int i=2;
        int b=integer-1;
        int count=0;


        return null;
    }


    /**
     * 求出给定范围[N,M]内，所有的勾股数元祖
     * 1<=N<M<=200
     */
    public static List gouGu(Integer int1, Integer int2){
        int b,c;
        for (int a=int1;a<=int2;a++){

        }
        return null;
    }

    public static void main(String[] args) {
        String str = "" ;
        str.substring(0);

        System.out.println("请输入数字：");
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>() ;

        int nextInt = in.nextInt();
        if(nextInt!= 0){
            list.add(nextInt);
        }
//        System.out.println("请输入数字：");
        while(nextInt!=0){
            System.out.println("请输入数字：");
            int nextInt2 = in.nextInt();
            if (nextInt2 != 0) {
                list.add(nextInt2);
            }
            nextInt = nextInt2 ;
        }
        for(int i= 0 ; i <list.size() ; i++){
            System.out.println(get(list.get(i)));
        }
        System.out.println("end");

    }
    public static int get(Integer num){
        int all = 0 ;
        for(int i = 2 ; i <= num/2 ; i ++ ){
            if(prime(i)&&prime(num-i)){
                all = all + 1 ;
            }
        }
        return all;
    }
    public static boolean prime(int num){
        boolean flag = true ;
        double sqrt = Math.sqrt(num);
        if(num == 2 || num ==3){

        }else{
            for(int i = 2 ; i <= sqrt;i ++){
                if(num%i==0){
                    flag=false ;
                    break ;
                }
            }
        }
        return flag ;

    }
}

package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 含基本运算的科学计算器
 * 输入要求：加减乘除的输入数据
 */
public class DemoScientificCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个包含加减乘除的表达式：");
        String s=sc.nextLine();
        System.out.println(s+"="+calculate(s));
    }

    public static double calculate(String expre) {
        List<String> num=transformEnd(expre);
        Stack<Double> stack = new Stack<>();
        double sum = 0;
        while (!num.isEmpty()) {
            String temp = String.valueOf(num.remove(0));
            if (isNamber(temp)) {
                double s=Double.parseDouble(temp);
                stack.push(s);
            } else {
                double a=stack.pop();
                double b=stack.pop();
                double c=calTwo(b,a,temp);
                stack.push(c);

            }
        }
        sum=stack.pop();
        return sum;
    }

    private static double calTwo(double a, double b, String opr) {
        double sum = 0;
        switch (opr) {
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "*":
                sum = a * b;
                break;
            case "/":
                sum = a / b;
                break;
        }
        return sum;
    }

    /**
     *
     * 1.将中缀表达式转化为后缀表达式（栈是用来进出运算的符号）
     */
    public static List<String> transformEnd(String expre) {
        List<String> sb = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        expre = expre.replaceAll("(\\D)", "o$1o");
        String[] esp = expre.trim().split("o");

        for (int i = 0; i < esp.length; i++) {
            String s = esp[i].trim();

            if (isNamber(s)) {
                // 如果是数字则输出
                sb.add(s);
            } else if (!s.isEmpty()) {

                if (s.charAt(0) == ')') {
                    while (stack.peek().charAt(0) != '(') {
                        sb.add(stack.pop());
                    }
                    stack.pop();
                } else {
                    if (!stack.isEmpty() && !isMaxExp(s.charAt(0), stack.peek().charAt(0))) {
                        while (!stack.isEmpty() && !isMaxExp(s.charAt(0), stack.peek().charAt(0))) {
                            sb.add(stack.pop());
                        }
                        stack.push(s);
                    } else {
                        stack.push(s);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.add(stack.pop());
        }
        return sb;
    }

    // 判断是否是数字
    private static boolean isNamber(String str) {
        try {
            Double.parseDouble(str);

        } catch (RuntimeException e) {
            return false;
        }
        ;
        return true;
    }

    // 判断是否进栈
    private static boolean isMaxExp(char exp1, char exp2) {
        if (exp1 == '(')
            return true;
        if (exp2 == ')')
            return true;
        if (transExp(exp1) > transExp(exp2))
            return true;

        return false;

    }

    private static int transExp(char exp) {
        int re = 0;
        switch (exp) {
            case '*':
            case '/':
                re = 2;
                break;
            case '+':
            case '-':
                re = 1;
                break;
        }
        return re;
    }

    //================简易方法=======================
    /*public static void main(String[] args) {
        Double op1;
        Double op2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个操作数(回车结束)");
        op1=sc.nextDouble();
        System.out.println("请输入运算符(回车结束)");
        op=sc.next();
        System.out.println("请输入第二个操作数(回车结束)");
        op2=sc.nextDouble();
        System.out.print("结果是：");
        switch(op) {
            case "+":System.out.println(op1+op2);break;
            case "-":System.out.println(op1-op2);break;
            case "*":System.out.println(op1*op2);break;
            case "/":System.out.println(op1/op2);break;
        }
    }*/
}

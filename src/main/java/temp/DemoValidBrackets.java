package temp;

import java.util.Stack;

/**
 * 最长有效括号字符串长度
 *  1、有效的的括号字符串指只包含小括号，且满足括号语法规则的字符串。例如"(())"是有效的，"((a))"、"(()"、"{()}"是无效的。
 *  2、有效括号子串是指输入字符串中满足有效括号字符串规则的子串。例如"()(()()"的有效括号子串包括"()"和"()()"，其最长的有效括号子串长度即为4。
 */
public class DemoValidBrackets {


    public static int longestValidParentheses(String s) {
        int max = 0, start = 0;
        if(null == s) return 0;

        int len = s.length();

        Stack<Integer> stack = new Stack<>();
        for(int index = 0; index < len; index++){
            //遇左括号(，压栈(栈中元素为当前位置所处的下标)
            if('(' == s.charAt(index)){
                stack.push(index);
                continue;
            } else {
                if(stack.isEmpty()){
                    start = index+1;
                    continue;
                } else {
                    stack.pop();
                    if(stack.isEmpty()){
                        max = Math.max(max, index-start+1);
                    } else {
                        max = Math.max(max, index-stack.peek());
                    }
                }
            }
        }

        return max;
    }

    public static int longestValidParentheses2(String s) {
        if(null == s) return 0;

        int len = s.length(), max = 0;
        int[] d = new int[len];

        for(int index = len-2; index >= 0; index--){
            int symIndex = index+1+d[index+1];
            if('(' == s.charAt(index) && symIndex < len && ')' == s.charAt(symIndex)){
                d[index] = d[index+1]+2;
                if(symIndex+1 < len){
                    d[index] += d[symIndex+1];
                }
            }
            max = Math.max(max, d[index]);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "()((())()())";
        int i = longestValidParentheses2(s);
        System.out.println(i);
    }

}

package aop;

import java.util.Scanner;

/**
 * @author aysnc86
 * @date
 */
public class HelloWorld {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            for (int i=0;i<=in.nextInt();i++){
                String a = in.next();
                String b = in.next();
                String result = findLongestSubstring(a, b);
                System.out.println("result:"+result.length());
            }

        }
    }

    /**
     * 题目：给定一个字符串（只包含小写英文字母），按顺序执行以下两条规则，输出计算后的字符串。
     * 规则1：对于连续顺序4位及以上的字母，中间使用“~”替换。
     *
     * 例如：“ahhhhhhbcdefko”,替换后为ahhhhhhb~fko。
     *
     * 规则2：对于连续重复出现3个及以上的字母，以该字母+重复的个数替换。
     *
     * 例如：“ahhhhhhbcdefko”，替换后为ah6bcdefko。
     *
     * 总体示例：
     *
     * 输入字符串为：ahhhhhhbcdefko 结果为：ah6b~fko
     *
     * 输入字符串为：ammmmmnopqko 结果为：am5~qko
     *
     * 输入字符串为：abcdefffffadfasdfa 结果为：a~f5adfasdfa
     *
     * 输入字符串为：mnopqqqrstabs 结果为：m~q3~tabs
     *
     * 输入字符串为：xyzabcd 结果为：xyza~d
     * 提示：
     *
     * 1. 规则按规则1，规则2顺序执行，先执行1，后执行2。
     *
     * 2. 请注意边界值的考虑，注意连续出现条件匹配的情况。
     *
     * 3. 请注意字符串拼接的性能消耗。
     *
     * 4. 请先花一定时间理清思路在再编写代码。
     *
     * 5. 可以试着把上面总体实例中的例子跑正确后再提交。
     */

    public String deal(String str){


        return null;
    }

    public String fn1(String s1){
        char[] charArr = s1.toCharArray();
        for (int i=0;i<charArr.length;i++){
            char c = charArr[i];
            if (c==charArr[i+1]){

            }
        }
        return null;
    }


    /**
     * 输入：2
     * 2
     * ABCDEFG
     * HijDEF
     * A1d345f
     * Wqw2d3590
     * 输出分别为：
     * 3
     * 2
     */
    public static int compare2Str(String a,String b){
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int lengthA = a.length();
        int lengthB = b.length();
        int min = Math.min(lengthA, lengthB);
        int bigger ;
        char[] minChar;
        char[] biggerChar;
        int result = 0;
        if (min==lengthA){
            bigger = lengthB;
            biggerChar= charsB;
            minChar =charsA;
        }else {
            bigger = lengthA;
            biggerChar = charsA;
            minChar = charsB;
        }

        af:for (int i=0;i<min;i++){
            char ai = minChar[i];
            int loopInner=0;
            for (int j=loopInner;j<bigger;j++){
                char bi = biggerChar[j];
                if (ai==bi){
                    //相等就加1
                    result+=1;
                    //从相同的地方开始循环
                    loopInner=j+1;
                    break af;
                }else {
                    result=0;
                }
            }

        }
        return result;
    }


    public static String findLongestSubstring(String s1, String s2) {
        //不同的三元表达式，是为了避免相同长度字符串的问题
        String max = s1.length() >= s2.length() ? s1 : s2;
        String min = s1.length() >= s2.length() ? s2 : s1;

        int longest = 0;//记录每次循环得到的最长子串长度
        String longestString = "";
        //这里使用短字符串，可降低时间复杂度
        for (int i = 0; i < min.length(); i++) {
            for (int j = i + 1; j <= min.length(); j++) {
                if (max.contains(min.substring(i, j)) && j - i > longest) {
                    longest = j - i;
                    longestString = min.substring(i, j);
                }
            }
        }
        return longestString;
    }

}

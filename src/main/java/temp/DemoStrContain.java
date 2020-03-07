package temp;

/**
 * 字符串包含。str1字符串和str2字符串都为大写字母字符串
 * 比如：str1字符串为："AADBDEDDEE";str2字符串为："BCDHKLAS"; 最后输入为：false
 *      str1:"ABCDEFGHIKL" ;str2:"AABBDGHGH"; result:true
 */
public class DemoStrContain {

    public static void main(String[] args) {

        String str1 = "ABCDEFGHIKL";
        String str2 = "AABBDGHGH";
        System.out.println("result:"+isContain(str1,str2));
    }

    public static boolean isContain(String str1,String str2){
        if (null==str1||null==str2){
            return false;
        }else {
            char[] chars2 = str2.toCharArray();
            for (char c2:chars2
                 ) {
                if (str1.contains(String.valueOf(c2))){
                    continue;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}

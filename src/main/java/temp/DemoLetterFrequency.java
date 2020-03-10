package temp;

import java.util.*;

/**
 * 统计字母（区分大小写）输入频次，并按照出现的频率大小打印。如果出现次数相同，则按照输入先后顺序打印
 * @date 2020/3/1010:58
 */
public class DemoLetterFrequency {

    public static void main(String[] args) {

        String str = "aaabbbccDHHHHH";
        Map<String, Integer> calculateMap = calculate(str);
        List<Map.Entry<String, Integer>> sortList = sort(calculateMap);
        for (Map.Entry<String,Integer> e:sortList
             ) {
            System.out.println(e.getKey()+"\t"+e.getValue());
        }
    }

    /**
     * 统计字母的个数
     * @param str
     * @return
     */
    public static Map<String,Integer> calculate(String str){

        char[] chars = str.toCharArray();
        /*
            1.初始化一个map对象；循环char数组，每取出一个字符，将其放入map中。字符作为key，value为1。
            2.从第二个字符开始，先取map中获取是否有该字符的key；如果有，则将value加1；否则就向map新put一个该字符为key，value为1的对象。
         */
        Map<String,Integer> result = new HashMap<String, Integer>();
        for (char in:chars
             ) {
            String key = String.valueOf(in);
            Integer value = result.get(key);
            if (null!=value){
                result.put(key,value+1);
            }else {
                result.put(key,1);
            }
        }
        return result;
    }

    /**
     * 将map中的数据转换成set，然后放入list中。通过list中的entry的value值比较大小进行排序
     * @param map
     * @return
     */
    public static List<Map.Entry<String,Integer>> sort(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> resultList = new ArrayList<>();
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            resultList.add(entry);
        }
        Collections.sort(resultList,new MyCompare());
        return resultList;
    }


}

class MyCompare implements Comparator<Map.Entry<String,Integer>>{

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue()-o1.getValue();
    }
}

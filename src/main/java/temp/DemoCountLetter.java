package temp;


import java.util.*;

/**
 * 统计字母出现的次数并按照字母频率从高到低输出
 */
public class DemoCountLetter {
    public static void main(String[] args) {
        //String data ="aaavzadfsdfsdhshdWashfasdf";
        String data = "aaaabbbbDDDeeeeeccccc";
        Map<Character,Integer> countMap = new HashMap<Character,Integer>();
        for(int i=0;i<data.length();i++){
            char c = data.charAt(i);
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1); //统计每个字符出现的次数
            }else{
                countMap.put(c, 1); //该字符第一次出现
            }
        }

        for(Map.Entry<Character, Integer> me:countMap.entrySet()){
            System.out.println(me.getKey()+"\t" + me.getValue());
        }

        List<Map.Entry<Character, Integer>> listResult=new ArrayList<Map.Entry<Character,Integer>>();
      for(Map.Entry<Character, Integer> me:countMap.entrySet()){
            listResult.add(me);
        }
        Collections.sort(listResult,new MyEntryComparator());
        System.out.println("++++++++++++++++++++++++++");

        for (Map.Entry<Character, Integer> obj : listResult) {
            System.out.println(obj.getKey() + "\t" + obj.getValue());
        }
    }
}

class MyEntryComparator implements Comparator<Map.Entry<Character, Integer>> {
    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        return o2.getValue() - o1.getValue();
    }
}



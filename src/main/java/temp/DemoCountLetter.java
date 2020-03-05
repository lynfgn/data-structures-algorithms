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

        LinkedList<Character> list=new LinkedList<Character>();
        List<Map.Entry<Character, Integer>> listResult=new ArrayList<Map.Entry<Character,Integer>>();
        Map<Character,Integer> sortMap = new HashMap<>();
        int max=0;
      for(Map.Entry<Character, Integer> me:countMap.entrySet()){
            /*if(me.getValue()<max){
                continue;
            }
            if(me.getValue()==max){
                list.add(me.getKey());
            }
            if(me.getValue()>max){
                list.clear();
                max=me.getValue();
                list.add(me.getKey());
            }*/
            listResult.add(me);
        }
        Collections.sort(listResult,new MyEntryComparator());
        //countMap.remove(list)
        System.out.println("++++++++++++++++++++++++++");

        for (Map.Entry<Character, Integer> obj : listResult) {
            System.out.println(obj.getKey() + "\t" + obj.getValue());
        }
        /*for(Character c:list){
            System.out.println(c+"\t" + max);
        }*/
    }
}

class MyEntryComparator implements Comparator<Map.Entry<Character, Integer>> {
    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        return o2.getValue() - o1.getValue();
    }
}



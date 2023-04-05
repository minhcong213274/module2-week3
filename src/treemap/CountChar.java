package treemap;

import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        String str = "con con con ga ga co";
        String [] word = str.split(" ");
        Map<String,Integer> wordCount = new TreeMap<>();
        for (String words:word){
            if (wordCount.containsKey(words)){
                wordCount.put(words,wordCount.get(words)+1);
            }else {
                wordCount.put(words,1);
            }
        }
        for (String key:wordCount.keySet()){
            System.out.println(key+" : "+wordCount.get(key));
        }

}
}
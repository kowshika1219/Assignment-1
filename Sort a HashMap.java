import java.util.*;

public class Main{
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(3,"\"apple\"");
        hashMap.put(2,"\"banana\"");
        hashMap.put(1,"\"cherry\"");
        Map<Integer,String> sortedMap = new TreeMap<>();
        sortedMap.putAll(hashMap);
        System.out.println(sortedMap);
    }
}

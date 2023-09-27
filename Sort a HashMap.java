import java.util.*;
class Main{
  public static void main(String[] args){
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(3,"\"apple\"");
    hashMap.put(2,"\"banana\"");
    hashMap.put(1,"\"cherry\"");
    TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);
    System.out.print("{");
    for(Map.Entry<Integer, String> entry : sortedMap.entrySet()){
      System.out.print(entry.getKey() + " = " + entry.getValue()+",");
    }
    System.out.print("}");
  }
}

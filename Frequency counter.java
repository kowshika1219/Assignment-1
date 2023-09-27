import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] array = {3, 4, 3, 5, 4, 2};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        System.out.println(frequencyMap);
    }
}

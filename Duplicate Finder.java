import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("\"apple\"");
        strings.add("\"banana\"");
        strings.add("\"apple\"");
        strings.add("\"cherry\"");
        strings.add("\"banana\"");
        strings.add("\"date\"");
        findDuplicates(strings);
    }
    public static void findDuplicates(ArrayList<String> list) {
        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> duplicates = new LinkedHashSet<>();
        for (String element : list) {
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }
        System.out.println(duplicates);
    }
}

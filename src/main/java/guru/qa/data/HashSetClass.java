package guru.qa.data;
import java.util.HashSet;

public class HashSetClass {
    private HashSet<String> set = new HashSet<>();

    public void addElement(String element) {
        set.add(element);
    }

    public void removeElement(String element) {
        set.remove(element);
    }

    public boolean findElement(String element) {
        return set.contains(element);
    }

    public void iterateSet() {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
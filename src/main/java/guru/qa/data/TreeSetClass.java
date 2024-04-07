package guru.qa.data;
import java.util.TreeSet;

public class TreeSetClass {
    private TreeSet<String> treeSet = new TreeSet<>();

    public void addElement(String element) {
        treeSet.add(element);
    }

    public void removeElement(String element) {
        treeSet.remove(element);
    }

    public boolean findElement(String element) {
        return treeSet.contains(element);
    }

    public void iterateSet() {
        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}


package guru.qa.data;
import java.util.ArrayList;

public class ArrayListClass {
    private ArrayList<String> list = new ArrayList<>();

    public void addElement(String element) {
        list.add(element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public boolean findElement(String element) {
        return list.contains(element);
    }

    public void iterateList() {
        for (String element : list) {
            System.out.println(element);
        }
    }
}

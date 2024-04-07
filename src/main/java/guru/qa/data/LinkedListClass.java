package guru.qa.data;
import java.util.LinkedList;

public class LinkedListClass {
    private LinkedList<String> linkedList = new LinkedList<>();

    public void addElement(String element) {
        linkedList.add(element);
    }

    public void removeElement(String element) {
        linkedList.remove(element);
    }

    public boolean findElement(String element) {
        return linkedList.contains(element);
    }

    public void iterateLinkedList() {
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

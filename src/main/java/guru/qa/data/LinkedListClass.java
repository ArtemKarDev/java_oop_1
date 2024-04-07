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
        int i = 0;
        while (i <= linkedList.size()-1){
            System.out.println(linkedList.get(i));
            i++;
        }
    }

}

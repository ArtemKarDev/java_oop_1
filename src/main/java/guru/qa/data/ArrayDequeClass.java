package guru.qa.data;
import java.sql.SQLOutput;
import java.util.ArrayDeque;

public class ArrayDequeClass {
    private ArrayDeque<String> deque = new ArrayDeque<>();

    public void addElement(String element) {
        deque.add(element);
    }

    public void removeElement(String element){
        deque.remove(element);
    }

    public boolean findElement(String element){
        return deque.contains(element);
    }

    public void iterateArray(){
        for (int i = 0; i<= deque.size(); i++){
            System.out.println(deque.getFirst());
            deque.removeFirst();
        }
    }

}

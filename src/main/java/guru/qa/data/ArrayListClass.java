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
        for (int i = 0 ; i <= list.size()-1; i++) {
            System.out.println(list.get(i));
        }
    }

    public void iterateList2(){
        int i = 0;
        do{
            System.out.println(list.get(i));
            i++;
        } while (i < list.size());
    }
}

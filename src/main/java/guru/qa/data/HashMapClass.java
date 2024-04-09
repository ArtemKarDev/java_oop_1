package guru.qa.data;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    private HashMap<String, String> hashMap = new HashMap<>();

    public void addElement(String key,String value) {
        hashMap.put(key,value);
    }

    public void removeElement(String key, String value){
        hashMap.remove(key,value);
    }

    public boolean findElement(String value){
        return hashMap.containsValue(value);
    }

    public void iterateHashMap(){
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }
}




package guru.qa;

import guru.qa.data.*;

public class Main {

    public static void main (String[] args) {
        ArrayListClass arrayList = new ArrayListClass();
        arrayList.addElement("Apple");
        arrayList.addElement("Banana");
        arrayList.iterateList();
        arrayList.iterateList2();
        System.out.println(arrayList.findElement("Banana"));

        HashSetClass hashSetClass = new HashSetClass();
        hashSetClass.addElement("Cat");
        hashSetClass.addElement("Dog");
        hashSetClass.iterateSet();


        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.addElement("One");
        linkedListClass.addElement("Two");
        linkedListClass.iterateLinkedList();

        TreeSetClass treeSetClass = new TreeSetClass();
        treeSetClass.addElement("January");
        treeSetClass.addElement("February");
        treeSetClass.iterateSet();

        ArrayDequeClass arrayDeque = new ArrayDequeClass();
        arrayDeque.addElement("Audi");
        arrayDeque.addElement("BMW");
        arrayDeque.iterateArray();

        HashMapClass hashMap = new HashMapClass();
        hashMap.addElement("apple", "red");
        hashMap.addElement("banana", "yellow");
        hashMap.addElement("orange", "orange");
        hashMap.iterateHashMap();

    }




}


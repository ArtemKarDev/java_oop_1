package guru.qa;

import guru.qa.data.ArrayListClass;
import guru.qa.data.HashSetClass;
import guru.qa.data.LinkedListClass;
import guru.qa.data.TreeSetClass;

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
    }

}


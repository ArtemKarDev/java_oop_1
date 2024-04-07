package guru.qa;


public class Main {

    public static void main (String[] args) {
        ArrayListClass arrayListClass = new ArrayListClass();
        arrayListClass.addElement("Apple");
        arrayListClass.addElement("Banana");
        arrayListClass.iterateList();

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


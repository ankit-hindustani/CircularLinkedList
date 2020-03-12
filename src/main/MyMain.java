package main;
import circularLinkedList.*;


public class MyMain {
    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();

//        obj.insertAtEnd(34);
//        obj.insertAtEnd(214);
//        obj.insertAtEnd(35);
//        obj.insertAtBegining(2);
       // obj.insertAtBegining(1);
        obj.insertAtEnd(256);
        obj.traverse();
        obj.deleteFromBegining();
       // obj.deleteFromEnd();
        obj.traverse();

    }
}

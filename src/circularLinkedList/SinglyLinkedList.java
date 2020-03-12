package circularLinkedList;
import node.*;
/*
@author Ankit Singh
GLA university mathura (u.p)
*/

public class SinglyLinkedList {
    Node head;

    //insert a element at begin
    public void insertAtBegining(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            head.setNext(head);
        } else {
            Node temp=head;
            //finding tail
            while (temp.getNext() != head){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }

            node.setNext(head);
            head = node;

    }



    //insert element at end
    public void insertAtEnd(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            node.setNext(head);
        } else {
            Node temp = head;
            while (!(temp.getNext() == head)) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setNext(head);
        }
    }


    //delete element from end of Linked List
    //there is one bug in this code if one element in the list.
    public void deleteFromBegining() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else {

            Node temp=head;
            while(temp.getNext()!=head){
                temp=temp.getNext();
            }

            head = head.getNext();
            temp.setNext(head);

        }
    }


    //delete element from end of Linked List
    //there is one bug in this code if one element in the list.
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else {
            Node currentNode = head;
            while (!(currentNode.getNext().getNext() == head)) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(head);
        }
    }


    //traverse linked List
    public void traverse() {
        Node temp = head;

        while(!(temp.getNext()==head)){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println(temp.getData());

    }
}

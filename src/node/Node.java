package node;

public class Node {
   private Node next;
    private int data;
    public Node(int data){
        this.data=data;
        next=null;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public void setData(int data){
        this.data=data;
    }

    public Node getNext(){
        return next;
    }
    public int getData(){
        return data;
    }

}

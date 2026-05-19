/**
 * MyLinkedList.java
 * A singly linked list built from Node objects
 */

public class MyLinkedList{
    private Node head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void print(){
        System.out.print("[");
        Node current = head;
        while(current != null){
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null]");
    }
}
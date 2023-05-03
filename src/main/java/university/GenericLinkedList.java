package university;

public class GenericLinkedList<T> {

    class Node{
        T value;
        Node next;

        Node(T val){
            this.value = val;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(T value){
        if(isEmpty()){
            head = new Node(value);
            tail = head;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(T value){
        if(isEmpty()){
            head = new Node(value);
            tail = head;
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int position, T value){
        if(position == 1){
            addFirst(value);
            return;
        }
        Node current = head;
        int count = 1;
        while(count < position - 1){
            count++;
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    public T deleteFirst(){
        if(isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        Node current = head;
        head = head.next;
        current.next = null;
        if(isEmpty()){
            tail = null;
        }
        return current.value;
    }

    public T deleteLast(){
        if(isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        if(head == tail){
            T value = head.value;
            head = null;
            tail = null;
            return value;
        }
        Node current = head;
        Node prev = null;

        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        tail = prev;
        return current.value;
    }

    public T delete(int position){
        if(isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        if(position == 1){
            deleteFirst();
        }
        Node current = head;
        Node prev = null;
        int count = 1;

        while(count < position){
            count++;
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        return current.value;
    }

    public boolean search(T value){
        Node current = head;
        while(current != null){
            if(value == current.value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}

package Assignment2.Question2;

/**
 * EECS 2011 - Assignment 2 (Question 2)
 * Student: Prince Barpaga
 * Student Number: 214007082
 */

public class NodeDLL<E>{
    private NodeDLL<E> prev; // pointer to the prev Node
    private NodeDLL<E> next; // pointer to the next Node
    private E data; // our value in the Node to be added

    public NodeDLL(E value, NodeDLL<E> prevLink, NodeDLL<E> nextLink){
        data = value;
        prev = prevLink;
        next = nextLink;
    }

    public void setPrev(NodeDLL<E> prev) {
        this.prev = prev;
    }
    public NodeDLL<E> getPrev() {
        return prev;
    }

    public void setNext(NodeDLL<E> next) {
        this.next = next;
    }
    public NodeDLL<E> getNext() {
        return next;
    }

    public void setData(E data) {
        this.data = data;
    }
    public E getData() {
        return data;
    }

    // print out the current content of deque
    public void printOutContent(){
        System.out.println("{ " + data + " }");
    }

}


package Assignment2.Question2;

import Practice.*;

/**
 * EECS 2011 - Assignment 2 (Question 2)
 * Student: Prince Barpaga
 * Student Number: 214007082
 */

public class DequeDLL<E> implements Deque<E> {

    private NodeDLL<E> first, last; // // sentinels
    private int size; // number of elements

    public DequeDLL(){ // initialize an empty deque
       first = new NodeDLL<>(null, null, null);
       last = new NodeDLL<>(null, first, null);
       first.setNext(last);
       size = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return size;
    }

    private void addBetween(E value, NodeDLL<E> before, NodeDLL<E> after){
        NodeDLL<E> newValue = new NodeDLL<>(value, before, after);
        before.setNext(newValue);
        after.setPrev(newValue);
        size++;
    }

    public void addFirst(E item){
        if(isEmpty()){
            throw new NullPointerException();
        }
        addBetween(item, first, first.getNext());
    }

    public void addLast(E item){
        if(isEmpty()){
            throw new NullPointerException();
        }
        addBetween(item, last.getPrev(), last);
    }

    private E remove(NodeDLL<E> myNode){
        NodeDLL<E> before = myNode.getPrev();
        NodeDLL<E> after = myNode.getNext();
        before.setNext(after);
        after.setPrev(before);
        size--;
        return myNode.getData();
    }

    public E removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("Error! Deque is Empty!!!");
        }
        return remove(first.getNext());
    }

    public E removeLast(){
        if(isEmpty()){
            throw new RuntimeException("Error! Deque is Empty!!!");
        }
        return remove(last.getPrev());
    }

    public E first(){
        return first.getData();
    }

    public E last(){
        return last.getData();
    }

    public void printOutContent(){
        NodeDLL<E> current = first.getNext();
        if(current.getData() == null){
            return;
        }
        //iterate over the Deque until it reaches the last one
        while(current.getNext().getData() != null){
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
    }
}

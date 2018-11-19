/**
 * EECS 2011 - Assignment 2 (Question 1)
 * Student: Prince Barpaga
 * Student Number: 214007082
 */

package Assignment2.Question1;

import java.util.*;

public class ArrayWithMemory<E> implements ReadWriteCount<E> {

    //private int size;
    private E[] data;
    int readCount =0;
    int writeCount =0;

    public ArrayWithMemory(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive: " + capacity);
        }
        //size = 0;
        data = (E[]) new Object[capacity];
        resetMemory();
    }

    public void write(int i, E e) {
        /*for(int i=size; i> index; i--){
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;*/
      data[i] = e;
      writeCount++;
    }

    public E read(int i) {
        readCount++;
        return data[i];
    }

    public int numberOfWrites() {
        return writeCount;
    }

    public int numberOfReads() {
        return readCount;
    }

    public void resetMemory() {
    writeCount = 0;
    readCount = 0;
    }

    public void printOutContent() {
        for(int i=0; i<data.length; i++){
            System.out.println(Arrays.toString(data));
        }
    }
}

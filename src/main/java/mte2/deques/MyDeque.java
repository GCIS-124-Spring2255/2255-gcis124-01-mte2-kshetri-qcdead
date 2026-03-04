// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    // ... for enqueueFront ...
    @Override
    public void enqueueFront(E element) {
        list.add(0, element);
    }

    // ... for enqueueBack ...
    @Override
    public void enqueueBack(E element) {
        list.add(size(), element);    
    }

    // ... for dequeueFront ...
    @Override
    public E dequeueFront() {
        return list.removeFirst();
    }

    // ... for dequeueBack ... 
    @Override
    public E dequeueBack() {
        return list.removeLast();
    }

    // ... for size ...
    @Override
    public int size() {
        return list.size();
    }

    // ... for iterator ...
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }


    public static void main(String[] args) { 
        MyDeque<Integer> q1 = new MyDeque<>();
        q1.enqueueFront(3);
        q1.enqueueFront(2);
        q1.enqueueBack(9);
        q1.enqueueBack(10);
        q1.enqueueFront(1);
        System.out.println("Size: ");
        System.out.println(q1.size());
        System.out.println("Iterator: ");
        for (int element : q1){
            System.out.println(element);
        }
        System.out.println("DequeueFront: ");
        System.out.println(q1.dequeueFront());
        System.out.println("DequeueBack: ");
        System.out.println(q1.dequeueBack());
        System.out.println("Size: ");
        System.out.println(q1.size());
        System.out.println("Iterator: ");
        for (int element : q1){
            System.out.println(element);
        }
    }
}
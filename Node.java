package com.company;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        LinkedList.size++;
    }
}
